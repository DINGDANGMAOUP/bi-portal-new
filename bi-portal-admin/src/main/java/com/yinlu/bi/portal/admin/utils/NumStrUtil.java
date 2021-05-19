package com.yinlu.bi.portal.admin.utils;

import com.yinlu.bi.portal.admin.constants.Constants;
import java.util.regex.Matcher;

/**
 * @author dzhao1
 */
public class NumStrUtil {
  public static String get(String username){
    Matcher matcher = Constants.PATTERN.matcher(username);
    return matcher.replaceAll("");
  }
}
