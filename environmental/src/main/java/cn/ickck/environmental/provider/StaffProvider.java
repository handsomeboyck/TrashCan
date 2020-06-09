package cn.ickck.environmental.provider;

import cn.ickck.environmental.domain.Staff;
import org.apache.ibatis.jdbc.SQL;

/**
 * @ClassName StaffProvider
 * @Description TODO  Staff构建动态SQL语句
 * @Author ck
 * @Date 2020/1/9 22:48
 * @Version 1.0
 **/
public class StaffProvider {
    public String UpdateStaff(final Staff staff)
    {
        return new SQL()
        {
            {
                UPDATE("staff");
                        if(staff.getAttendanceForfeit()!=null)
                        {
                            SET("attendance_forfeit = #{attendanceForfeit}");
                        }
                if(staff.getAttendance()!=null)
                {
                    SET("attendance = #{attendacne}");
                }
                if(staff.getAttendanceAward()!=null)
                {
                    SET("attendanceAward = #{attendacneAward}");
                }
                if(staff.getBasicSalary()!=null)
                {
                    SET("basic_salary = #{basicSalary}");
                }
                if(staff.getInsurance()!=null)
                {
                    SET("insurance = #{insurance}");
                }
                if(staff.getDate()!=null)
                {
                SET("date = #{date}");
                }
                if(staff.getAttendanceDate()!=null)
                {
                    SET("attendance_date = #{attendanceDate}");
                }
                if(staff.getName()!=null)
                {
                SET("name= #{name}");

                }
                if(staff.getPassword()!=null)
                {
                    SET("password = #{password}");
                }
                if(staff.getPersonalTax()!=null)
            {
                SET("personalTax = #{personalTax}");
            }
                if(staff.getRealWages()!=null)
                {
                    SET("realWages = #{realWages}");
                }
                if (staff.getTelephone()!=null)
                {
                    SET("telephone = #{telephone}");
                }
                if (staff.getUsername()!=null)
                {
                    SET("username = #{username}");
                }

                if (staff.getCanNum()!=null)
                {
                    SET("can_num = #{canNum}");
                }

                if (staff.getStatus()!=null)
                {
                    SET("status = #{status}");
                }









                WHERE("id = #{id}");
            }
        }.toString();

    }



}
