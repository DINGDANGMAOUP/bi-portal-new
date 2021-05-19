package com.yinlu.bi.portal.admin.security;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yinlu.bi.portal.admin.model.SystemUser;
import com.yinlu.bi.portal.admin.model.SystemUserGroup;
import com.yinlu.bi.portal.admin.service.SystemUserGroupService;
import com.yinlu.bi.portal.admin.service.SystemUserService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Slf4j
public class SysUserDetailsService implements UserDetailsService {

  @Resource SystemUserService systemUserService;
  @Resource SystemUserGroupService systemUserGroupService;

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    log.debug("开始登陆验证，用户名为: {}", s);

    // 根据用户名验证用户
    List<SystemUser> userList =
        systemUserService.list(
            Wrappers.<SystemUser>lambdaQuery()
                .eq(SystemUser::getDomainAccount, s)
                .eq(SystemUser::getStatus, 0));

    SystemUser user =
        userList.stream()
            .max((a, b) -> a.getModifiedOn().isAfter(b.getModifiedOn()) ? 1 : -1)
            .get();

    if (userList.size() == 0) {
      throw new UsernameNotFoundException("用户名不存在，登陆失败。");
    }

    // 构建UserDetail对象
    UserDetail userDetail = new UserDetail();
    userDetail.setSystemUser(user);
    List<SystemUserGroup> roles=new ArrayList<>();
    roles.add(systemUserGroupService.getById(user.getGroupId()));
    userDetail.setRoles(roles);
    return userDetail;
  }
}
