package com.yinlu.bi.portal.admin.constants;

import java.util.regex.Pattern;

/**
 * 系统常量
 * @author dzhao1
 */
public interface Constants {
  /**
   * 有效数据标识
   */
  int STATUS=0;
  /**
   * 菜单层级初始化
   * 0为一级菜单
   */
  int LEVEL=0;

  /**
   * oa跳转令牌 前4位+n位工号+后16位
   */
  int LENGTH=20;

  /**
   * 账户名前缀
   */
  String USER_PREFIX ="yinlu\\";

  /**
   * 正则匹配数字
   */
  Pattern PATTERN = Pattern.compile("[^0-9]");
}
