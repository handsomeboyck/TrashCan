package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.WechatComment;

import java.util.List;

public interface WechatCommentService {
    //新增评论
    Integer insertWechatComment(WechatComment wechatComment);
    //查询所有评论
    List<WechatComment> findAllWechatComment();

}
