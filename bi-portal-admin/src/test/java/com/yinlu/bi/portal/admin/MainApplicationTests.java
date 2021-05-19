package com.yinlu.bi.portal.admin;


import com.yinlu.bi.portal.admin.service.MenuService;

import com.yinlu.bi.portal.core.http.HttpResult;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainApplicationTests {

    @Resource
    MenuService menuService;
    @Test
    void contextLoads() {
    //        Matcher matcher = Constants.PATTERN.matcher("asdasd");
    //        String s = matcher.replaceAll("");
    //    System.out.println("s="+s.length());
    //        String temp="22221330000153333333333333333";
    //    System.out.println(temp.substring(4, temp.length() - 16));
    //        List<SystemReportService> systemReportServices =
    // menuService.listByName("yinlu\\biadmin");
    //    System.out.println(systemReportServices.toString());
//    System.out.println(HttpResult.error("账号不存在"));
    }

}
