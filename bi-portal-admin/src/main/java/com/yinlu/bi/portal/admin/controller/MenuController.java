package com.yinlu.bi.portal.admin.controller;

import com.yinlu.bi.portal.admin.service.MenuService;
import com.yinlu.bi.portal.core.http.HttpResult;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dzhao1
 */
@RestController
public class MenuController {
  @Resource
  MenuService menuService;

  @GetMapping("/menu")
  public HttpResult menu(){
    return HttpResult.success(menuService.listByName("yinlu\\biadmin"));
  }

}
