package cn.ickck.environmental.controller;

import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.Staff;
import cn.ickck.environmental.service.StaffService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName StaffController
 * @Description TODO
 * @Author ck
 * @Date 2020/1/9 21:35
 * @Version 1.0
 **/
@RestController
@RequestMapping("pub")
public class StaffController {

    @Autowired
    StaffService staffService;

   //通过id查询员工信息
    @RequestMapping("/findNameById")
    public JsonData findNameById(Integer id)
    {
        return JsonData.buildSuccess(staffService.findNameById(id));
    }

    //员工考勤信息查询
    @RequestMapping("/findAllAttendanceInformation")
   public JsonData findAllAttendanceInformation()
    {

        return  JsonData.buildSuccess(staffService.findAllBaseInformation());
    }


    //员工工资信息查询
    @RequestMapping("/findAllSalaryInformation")
    public JsonData findAllSalaryInformation()
    {
        return  JsonData.buildSuccess(staffService.findAllSalaryInformation());
    }


    @PostMapping("/UpdateStaff")
    public JsonData UpadateStaff(@RequestBody Staff staff)
    {
        String name = staff.getName();
        staffService.UpdateStaff(staff);
        return JsonData.buildSuccess("姓名为"+name+"的员工信息修改成功");
    }

    @DeleteMapping("/DeleteStaffById")
    public JsonData DeleteStaff(Integer id)
    {
        staffService.DeleteStaff(id);
        return JsonData.buildSuccess("编号为"+id+"的员工信息删除成功");

    }
    //插入员工基本信息 ，姓名，电话，密码
    @PostMapping("/InsertStaff")
    public JsonData InsertStaff(@RequestBody Staff staff)
    {
        return JsonData.buildSuccess(staffService.InsertStaff(staff));
    }


    @RequestMapping("/findAllStaff")
    public JsonData findAllStaff()
    {
        return JsonData.buildSuccess(staffService.findAllStaff());
    }


    @RequestMapping("/findAllStaffBaseInfo")
    public  JsonData findAllBaseInfo()
    {
        return JsonData.buildSuccess(staffService.findAllBaseInfo());
    }


    @RequestMapping("Applogin")
    public JsonData Applogin(HttpServletRequest req)
    {
        String reqJson = req.getParameter("reqJson");

        Gson gson = new Gson();
       Staff staff =  gson.fromJson(reqJson,Staff.class);

        if (staffService.CountStaffByNameAndPassword(staff.getName(),staff.getPassword())==1)
           return JsonData.buildSuccess(staffService.findStaffIdByNameAndPassword(staff.getName(),staff.getPassword()));
         else
             return JsonData.buildError("账号或密码错误");
    }

}
