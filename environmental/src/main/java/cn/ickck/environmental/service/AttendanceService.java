package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.Attendance;

import java.util.Date;
import java.util.List;

public interface AttendanceService {


    Integer InsertAttendanceRecrod(Attendance attendance);

    List<Date> findAttendanceRecrodByStaffId(Integer staffId);

}
