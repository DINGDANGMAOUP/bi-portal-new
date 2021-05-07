package com.yinlu.bi.portal.core.exception;

import lombok.Data;

/** @author kuroneko */
@Data
public class SystemException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  private String msg;
  private int code = 500;
}
