package cn.ickck.environmental.mapper;

import cn.ickck.environmental.domain.WechatComment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WechatCommentMapper {

    @Insert("insert into wechat_comment(nickname,date,content) values(#{nickname},#{date},#{content})")
    Integer InsertComment(WechatComment wechatComment);



    @Select("select * from wechat_comment")
    List<WechatComment> findAllWechatComment();
}
