package cn.ickck.environmental.controller;

import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author ck
 * @Date 2019/12/28 15:55
 * @Version 1.0
 **/
@RestController
@RequestMapping("pub")
public class TestController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/test")
    private String Test()
    {
        return "hello world";
    }
    @RequestMapping("/findByName")
    private JsonData findByName(String username)
    {
        return JsonData.buildSuccess(adminService.findAllUserInfoByUsername(username));
    }
}
