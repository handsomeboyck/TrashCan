package cn.ickck.environmental.service.Impl;

import cn.ickck.environmental.domain.WechatComment;
import cn.ickck.environmental.mapper.WechatCommentMapper;
import cn.ickck.environmental.service.WechatCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeChatCommentServiceImp implements WechatCommentService {
    @Autowired
    private WechatCommentMapper wechatCommentMapper;

    @Override
    public Integer insertWechatComment(WechatComment wechatComment) {
        return wechatCommentMapper.InsertComment(wechatComment);
    }

    @Override
    public List<WechatComment> findAllWechatComment() {
        return wechatCommentMapper.findAllWechatComment();
    }
}
