package cn.ickck.environmental.service.Impl;

import cn.ickck.environmental.domain.Attendance;
import cn.ickck.environmental.mapper.AttendanceMapper;
import cn.ickck.environmental.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/*
  打卡记录

 */

@Service
public class AttendanceServiceImp implements AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;

    @Override
    public Integer InsertAttendanceRecrod(Attendance attendance) {
        return attendanceMapper.InsetAttandanceRecrod(attendance);
    }

    @Override
    public List<Date> findAttendanceRecrodByStaffId(Integer staffId) {
        return attendanceMapper.findDateRecrodByStaffId(staffId);
    }
}
