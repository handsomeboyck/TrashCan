package cn.ickck.environmental.controller;


import cn.ickck.environmental.domain.Attendance;
import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.service.AttendanceService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("pub")
public class AttanceController {

    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping("InsertAttenceRecord")
    public JsonData InsertAttendanceRecrod(HttpServletRequest req)
    {
        String reqJson = req.getParameter("reqJson");
        Gson gson = new Gson();
        Attendance attendance = gson.fromJson(reqJson,Attendance.class);
        attendance.setDate(new Date());
        return JsonData.buildSuccess(attendanceService.InsertAttendanceRecrod(attendance));

    }

    @RequestMapping("findAttendanceRecrodByStaffId")
    public JsonData findAttendanceRecrodById(HttpServletRequest req)
    {
        String reqJson = req.getParameter("reqJson");
        Gson gson = new Gson();
        Attendance attendance = gson.fromJson(reqJson,Attendance.class);

        return JsonData.buildSuccess(attendanceService.findAttendanceRecrodByStaffId(attendance.getStaffId()));
    }
}
