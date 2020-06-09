package cn.ickck.environmental.mapper;

import cn.ickck.environmental.domain.TrashCan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TrashCanMapper {

    @Select("select * from trash_can")
    List<TrashCan> findAllTrashCan();

    @Select(("select * from trash_can where id = #{id}"))
    TrashCan findTrashCanById(Integer id);



//    @Insert("insert into admin(name,password,username,tel,status,permission) values(#{name},#{password},#{username},#{tel},#{status},#{permission})")
//    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
//    Integer insertAdmin(Admin admin);
//    @Insert("insert into trash_can(address,status,x,y,health,lable,tel,contact) " +
//            "values(#{address},#{status},#{x},#{y},#{health},#{lable},#{tel),#{contact}")
//    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
//    Integer insertTrashCanInfo(TrashCan trashCan);

    @Insert("insert into trash_can(address,status,x,y,health,lable,tel,contact) " +
            "values(#{address},#{status},#{x},#{y},#{health},#{lable},#{tel},#{contact})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    Integer InsertTrashCan(TrashCan trashCan);

    @Select("select trash_can.id from trash_can")
    Integer[] findAllTrashCanId();

    @Delete("delete from trash_can where id = #{id}")
    void deleteTrashCan(Integer id);



}
