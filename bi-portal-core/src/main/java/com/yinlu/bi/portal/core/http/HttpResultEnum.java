package com.yinlu.bi.portal.core.http;

/**
 * @author dzhao1
 */

public enum HttpResultEnum {
  //请求成功
  SUCCESS(200, "success"),
  //无效参数
  INVALID_PARAMETER(402,"invalid parameter"),
  //登入失败
  LOGIN_FAILED(402,"login failed"),
  //server error
  SERVER_ERROR(500, "server error"),
  //bad request
  BAD_REQUEST(400, "bad request"),
  //unauthorized
  UNAUTHORIZED(401, "unauthorized"),
  //not found
  NOT_FOUND(404, "not found"),
  SYSTEM_ABNORMAL(999,"system abnormal");

  /**
   * 状态码
   */
  private final int code;
  /**
   * 状态信息
   */
  private final String desc;

  public int getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }

  HttpResultEnum(int code,String msg){
    this.code=code;
    this.desc=msg;

  }


}
