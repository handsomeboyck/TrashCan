package cn.ickck.environmental.mapper;

import cn.ickck.environmental.domain.WechatUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface WeChatUserMapper {

    @Select("select count(*) from wechat_user where nickname = #{nickname}")
    Integer countByNickName(String nickname);

    @Insert("insert into wechat_user(nickname,points) values(#{nickname},#{points})")
    Integer InsertWechatUser(WechatUser wechatUser);

    @Update("update wechat_user set points=points+1 where nickname=#{nickname}")
    Integer UpdatePoints(String nickname);

    @Select("select points from wechat_user where nickname=#{nickname}")
    Integer findPointsByNickName(String nickname);
}
