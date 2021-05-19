package com.yinlu.bi.portal.core.http;

import lombok.Data;
import lombok.NoArgsConstructor;

/** @author kuroneko */
@NoArgsConstructor
@Data
public class HttpResult {

  private int code = 200;
  private String desc;
  private String detail;
  private Object data;

  private HttpResult(HttpResultEnum resultEnum) {
    this.code = resultEnum.getCode();
    this.desc = resultEnum.getDesc();
  }

  private HttpResult(HttpResultEnum resultEnum, String detail) {
    this.code = resultEnum.getCode();
    this.desc = resultEnum.getDesc();
    this.detail = detail;
  }

  private HttpResult(HttpResultEnum resultEnum, Object data) {
    this.code = resultEnum.getCode();
    this.desc = resultEnum.getDesc();
    this.data = data;
  }

  public static HttpResult of(HttpResultEnum resultEnum) {
    return new HttpResult(resultEnum);
  }

  public static HttpResult of(HttpResultEnum resultEnum, String detail) {
    return new HttpResult(resultEnum, detail);
  }

  public static  HttpResult of(HttpResultEnum resultEnum, Object data) {
    return new HttpResult(resultEnum, data);
  }

  public static HttpResult success() {
    return new HttpResult(HttpResultEnum.SUCCESS);
  }

  public static  HttpResult success(Object data) {
    return new HttpResult(HttpResultEnum.SUCCESS, data);
  }

  public static HttpResult fail() {
    return new HttpResult(HttpResultEnum.SERVER_ERROR);
  }

  public static  HttpResult fail(String detail) {
    return new HttpResult(HttpResultEnum.SERVER_ERROR, detail);
  }

  public static HttpResult unauthorized() {
    return new HttpResult(HttpResultEnum.UNAUTHORIZED);
  }

  public static  HttpResult unauthorized(String detail) {
    return new HttpResult(HttpResultEnum.UNAUTHORIZED, detail);
  }

  public static HttpResult badRequest() {
    return new HttpResult(HttpResultEnum.BAD_REQUEST);
  }

  public static  HttpResult badRequest(String detail) {
    return new HttpResult(HttpResultEnum.BAD_REQUEST, detail);
  }

  public static HttpResult notFound() {
    return new HttpResult(HttpResultEnum.NOT_FOUND);
  }

  public static  HttpResult notFound(String detail) {
    return new HttpResult(HttpResultEnum.NOT_FOUND, detail);
  }

  public static HttpResult invalidParam() {
    return new HttpResult(HttpResultEnum.INVALID_PARAMETER);
  }

  public static  HttpResult invalidParam(String detail) {
    return new HttpResult(HttpResultEnum.INVALID_PARAMETER, detail);
  }

  public static HttpResult loginFailed() {
    return new HttpResult(HttpResultEnum.LOGIN_FAILED);
  }

  public static  HttpResult loginFailed(String detail) {
    return new HttpResult(HttpResultEnum.LOGIN_FAILED, detail);
  }


  public static HttpResult error() {
    return new HttpResult(HttpResultEnum.SYSTEM_ABNORMAL);
  }

  public static  HttpResult error(String detail) {
    return new HttpResult(HttpResultEnum.SYSTEM_ABNORMAL, detail);
  }

}
