package cn.ickck.environmental.mapper;

import cn.ickck.environmental.domain.WechatDeliever;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WechatDelieverMapper {

    @Insert("insert into wechat_deliever(nickname,date,address,num,result,url) values(#{nickname},#{date},#{address},#{num},#{result},#{url})")
    Integer InsertWechatDeliver(WechatDeliever wechatDeliever);

    @Select("select date,address,num,result from wechat_deliever where nickname =#{nickname}")
    List<WechatDeliever> findDeliverByNickName(String nickname);
}
