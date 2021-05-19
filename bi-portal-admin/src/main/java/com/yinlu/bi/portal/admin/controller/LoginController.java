package com.yinlu.bi.portal.admin.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yinlu.bi.portal.admin.constants.Constants;
import com.yinlu.bi.portal.admin.model.SystemUser;
import com.yinlu.bi.portal.admin.service.SystemUserService;
import com.yinlu.bi.portal.admin.utils.NumStrUtil;
import com.yinlu.bi.portal.common.pojo.vo.LoginVO;
import com.yinlu.bi.portal.core.http.HttpResult;
import com.yinlu.bi.portal.core.http.HttpResultEnum;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** @author dzhao1 */
@Slf4j
@RestController
public class LoginController {

  @Resource private SystemUserService systemUserService;

  /** 登录接口 */
  @PostMapping(value = "/login")
  public HttpResult login(@RequestBody LoginVO loginVO) {
    SystemUser user;
    List<SystemUser> userList;
    String username = loginVO.getAccount();
    String empNumber = NumStrUtil.get(loginVO.getEmpNumber());

    if (StringUtils.isBlank(username)&&StringUtils.isBlank(empNumber)){
      return HttpResult.invalidParam("非法参数");
    }
    // 用户信息
    if (empNumber.length() > Constants.LENGTH) {
      // 工号查询
      userList =
          systemUserService.list(
              Wrappers.<SystemUser>lambdaQuery()
                  .select()
                  .eq(SystemUser::getEMPNumber,empNumber)
                  .eq(SystemUser::getStatus, 0));

    } else {
      // 账号查询
      userList =
          systemUserService.list(
              Wrappers.<SystemUser>lambdaQuery()
                  .eq(SystemUser::getDomainAccount, Constants.USER_PREFIX + username)
                  .eq(SystemUser::getStatus, 0));
    }
    user =
        userList.stream()
            .max((a, b) -> a.getModifiedOn().isAfter(b.getModifiedOn()) ? 1 : -1)
            .get();
    // 账号不存在、密码错误
    if (user == null) {
      return HttpResult.loginFailed("账号不存在");
    }
    // 账号锁定
    if (user.getStatus()) {
      return HttpResult.loginFailed("账号已被锁定,请联系管理员");
    }
    // 系统登录认证
    return HttpResult.success(user);
  }
}
