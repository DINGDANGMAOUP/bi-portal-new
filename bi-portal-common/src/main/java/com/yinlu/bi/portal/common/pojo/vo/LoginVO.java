package com.yinlu.bi.portal.common.pojo.vo;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author dzhao1
 */
@Data
public class LoginVO {

  private String account;
  private String password;
  private String empNumber;
}
