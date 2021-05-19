package com.yinlu.bi.portal.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author dzhao1
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {



  /**
   * 定义加密器Bean
   * @return 加密器
   */
  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }

  /**
   * 定义AuthenticationManager
   * @return 认证
   * @throws Exception 异常
   */
  @Bean
  @Override
  public AuthenticationManager authenticationManager() throws Exception {
    return super.authenticationManager();
  }
}
