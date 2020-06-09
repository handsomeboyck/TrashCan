package cn.ickck.environmental.controller;


import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.Staff;
import cn.ickck.environmental.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//需要登陆之后才可访问
@RestController
@RequestMapping("authc")
public class AuthcController {

    @Autowired
    StaffService staffService;

    //通过id查询员工信息
    @RequestMapping("/findNameById")
    JsonData findNameById(Integer id)
    {
        return JsonData.buildSuccess(staffService.findNameById(id));
    }

    //员工考勤信息查询
    @RequestMapping("/findAllAttendanceInformation")
    JsonData findAllAttendanceInformation()
    {

        return  JsonData.buildSuccess(staffService.findAllBaseInformation());
    }


    //员工工资信息查询
    @RequestMapping("/findAllSalaryInformation")
    JsonData findAllSalaryInformation()
    {
        return  JsonData.buildSuccess(staffService.findAllSalaryInformation());
    }


    @PostMapping("/UpdateStaff")
    JsonData UpadateStaff(@RequestBody Staff staff)
    {
        String name = staff.getName();
        staffService.UpdateStaff(staff);
        return JsonData.buildSuccess("姓名为"+name+"的员工信息修改成功");
    }

    @DeleteMapping("/DeleteStaffById")
    JsonData DeleteStaff(Integer id)
    {
        staffService.DeleteStaff(id);
        return JsonData.buildSuccess("编号为"+id+"的员工信息删除成功");

    }
    //插入员工基本信息 ，姓名，电话，密码
    @PostMapping("/InsertStaff")
    JsonData InsertStaff(@RequestBody Staff staff)
    {
        return JsonData.buildSuccess(staffService.InsertStaff(staff));
    }



    //查询所有员工基本信息
    @RequestMapping("/findAllStaffBaseInfo")
    public  JsonData findAllBaseInfo()
    {
        return JsonData.buildSuccess(staffService.findAllBaseInfo());
    }


    @RequestMapping("findStaffBaseInfoById")
    public JsonData findStaffInfoById(Integer id)
    {
        return JsonData.buildSuccess(staffService.findStaffBaseInfoById(id));
    }

}
