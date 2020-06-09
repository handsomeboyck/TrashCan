package cn.ickck.environmental.controller;

import cn.ickck.environmental.domain.Admin;
import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authc")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @RequestMapping("findAllAdminInfo")
    public JsonData findAllAdminInfo()
    {
        return JsonData.buildSuccess(adminService.findAllAdminInfo());
    }

    @RequestMapping("findAdminInfoById")
    public JsonData findAdminInfoById(int id)
    {
        return  JsonData.buildSuccess(adminService.findSimpleUserInfoById(id));
    }

    @RequestMapping("findAdminInfoByName")
    public JsonData findAdminInfoByName(String name)
    {
        return JsonData.buildSuccess(adminService.findSimpleUserInfoByUsername(name));
    }


    @PostMapping("insertAdmin")
    public  JsonData InsertAdmin(@RequestBody Admin admin)
    {
        return JsonData.buildSuccess(adminService.insertAdmin(admin));
    }


    @PostMapping("updateAdmin")
    public JsonData UpdateAdmin(@RequestBody Admin admin)
    {
        adminService.UpdateAdmin(admin);
        return JsonData.buildSuccess("id为"+admin.getId()+"的员工信息修改成功");
    }

    @RequestMapping("deleteAdminById")
    public  JsonData DeleteAdminById(Integer id)
    {
        adminService.deleteAdmin(id);
        return JsonData.buildSuccess("id为"+id+"的员工信息删除成功");
    }




}
