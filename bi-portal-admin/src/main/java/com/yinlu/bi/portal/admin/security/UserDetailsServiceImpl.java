package com.yinlu.bi.portal.admin.security;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yinlu.bi.portal.admin.model.SystemUser;
import com.yinlu.bi.portal.admin.service.SystemUserService;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/** 用户登录认证信息查询 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Resource
  private SystemUserService systemUserService;

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    return null;
  }

//  @Override
//  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//    SystemUser user = systemUserService.getOne(Wrappers.<SystemUser>lambdaQuery().select().eq(SystemUser::getDomainAccount,username));
//    if (user == null) {
//      throw new UsernameNotFoundException("该用户不存在");
//    }
//    // 用户权限列表，根据用户拥有的权限标识与如 @PreAuthorize("hasAuthority('sys:menu:view')") 标注的接口对比，决定是否可以调用接口
//    Set<String> permissions = systemUserService.findPermissions(user.getName());
//    List<GrantedAuthority> grantedAuthorities =
//        permissions.stream().map(GrantedAuthorityImpl::new).collect(Collectors.toList());
//    return new JwtUserDetails(
//        user.getDomainAccount(), user.getPassword(), user.getSalt(), grantedAuthorities);
//  }
}
