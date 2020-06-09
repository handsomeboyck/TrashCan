package cn.ickck.environmental.mapper;

import cn.ickck.environmental.domain.Admin;
import cn.ickck.environmental.provider.AdminProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

// AdminMapper
public interface AdminMapper {
    @Select("select * from admin where name = #{name}")
    Admin findByname(@Param("name") String name);



    @Select("select * from admin where id = #{id}")
    Admin findById(@Param("id")int id);

    @Select("select * from admin where name = #{name} and password = #{pwd}")
    Admin findByNameAndPWD(@Param("name") String name, @Param("pwd") String password);


    @Select("select * from admin")
    List<Admin> findAllAdminInfo();

    @Insert("insert into admin(name,password,username,tel,status,permission) " +
            "values(#{name},#{password},#{username},#{tel},#{status},#{permission})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    Integer insertAdmin(Admin admin);

    @UpdateProvider(type = AdminProvider.class,method = "UpdateAdmin")
    void UpdateAdmin(Admin admin);

    @Delete("delete from admin where id = #{id}")
    Integer DeleteAdmin(Integer id);

}
