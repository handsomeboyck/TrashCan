package cn.ickck.environmental.mapper;

import cn.ickck.environmental.domain.Attendance;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface AttendanceMapper {
//    @Insert("insert into staff(name,telephone,password) values(#{name},#{telephone},#{password})")
    @Insert("insert into attendance(staff_id,x,y,date) values(#{staffId},#{x},#{y},#{date}) ")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    Integer InsetAttandanceRecrod(Attendance attendance);


    @Select("select date from attendance where staff_id = #{staffId}")
    List<Date> findDateRecrodByStaffId(Integer staffId);
}
