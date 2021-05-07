package com.yinlu.bi.portal.admin.service;

import com.yinlu.bi.portal.admin.model.SystemReportService;
import java.util.List;

/**
 * @author dzhao1
 */
public interface MenuService {

  /**
   * 获取用户路由树
   * @param name 用户名
   * @return  对应路由树
   */
  List<SystemReportService> listByName(String name);
}
