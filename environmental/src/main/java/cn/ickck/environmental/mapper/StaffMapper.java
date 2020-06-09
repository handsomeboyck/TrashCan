package cn.ickck.environmental.mapper;

import cn.ickck.environmental.domain.Staff;
import cn.ickck.environmental.provider.StaffProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface StaffMapper
{
    @Select("select name from staff where id = #{id}")
    String selectById(Integer id);

    @Select("select id,name,attendance_forfeit,attendance,attendance_award,attendance_date,date from staff")
    List<Staff> findAllStaff_attendence_information();

    @Select("select id,name,basic_salary,attendance_forfeit,attendance_award,date,insurance,personalTax,realWages,date from staff")
    List<Staff>  findAllStaff_salary();

    @UpdateProvider(type = StaffProvider.class,method = "UpdateStaff")
    void UpdateStaff(Staff staff);

    @Delete("delete from staff where id = #{id}")
    void DeleteStaff(Integer id);

    @Select("select * from staff")
    List<Staff> findAllStaff();

    @Select("select id,name,username,password,telephone,can_num,status from staff")
    List<Staff> findAllStaff_BaseInfo();


    @Select("select id,name,username,password,telephone,can_num,status from staff where id = #{id}")
     Staff findStaff_BaseInfoById(Integer id);
//    @Select("select * from admin where name = #{name} and password = #{pwd}")
//    Admin findByNameAndPWD(@Param("name") String name, @Param("pwd") String password);


  @Select("select id from staff where name = #{name} and password = #{password}")
  Integer findStaffIdByNameAndPWD(@Param("name")String name,@Param("password")String password);

  @Select("select count(*) from staff where name = #{name} and password = #{password}")
  Integer CountStaff(@Param("name")String name,@Param("password")String password);






//
//    @Insert("INSERT INTO user(name,number,dgh,max_gh,weight) VALUES(#{name}, #{number}, #{dgh},#{max_gh},#{weight})")
//    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
//    int insert(User user);

    @Insert("insert into staff(name,telephone,password) values(#{name},#{telephone},#{password})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    Integer insert(Staff staff);


}
