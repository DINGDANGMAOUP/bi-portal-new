package com.yinlu.bi.portal.admin.security;

import com.yinlu.bi.portal.admin.model.SystemGroupReport;
import com.yinlu.bi.portal.admin.model.SystemUser;
import com.yinlu.bi.portal.admin.model.SystemUserGroup;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
public class UserDetail implements Serializable, UserDetails {
    private static final long serialVersionUID = 1L;

    /**
     * 用户信息
     */
    private SystemUser systemUser;
    /**
     * 用户扮演角色
     */
    private List<SystemUserGroup> roles;
    /**
     * 角色对应菜单
     */
    private List<SystemGroupReport> menuList;
    private Collection<? extends GrantedAuthority> grantedAuthorities;

    public int getUserId() {
        return this.systemUser.getUserId();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
      if (grantedAuthorities != null) {
        return this.grantedAuthorities;
      }
        List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();
        List<SystemUserGroup> roles = new ArrayList<>();
        roles.forEach(role->{

        });
//        systemUserGroupList.forEach(role -> {
//            authorities.add(role.getGroupId());
//            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleCode()));
//        });
        this.grantedAuthorities = grantedAuthorities;
//        this.roles = authorities;
        return this.grantedAuthorities;
    }

  @Override
  public String getPassword() {
    return null;
  }

//    @Override
//    public String getPassword() {
//        return this.systemUser.getPassword();
//    }

    @Override
    public String getUsername() {
        return this.systemUser.getDomainAccount();
    }

    /**
     * 账户是否没过期
     *
     * @return boolean
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 账户是否没被锁定
     *
     * @return boolean
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 账户凭据是否没过期
     *
     * @return boolean
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 账户是否启用
     *
     * @return boolean
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
