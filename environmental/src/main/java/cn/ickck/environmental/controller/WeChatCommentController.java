package cn.ickck.environmental.controller;

import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.WechatComment;
import cn.ickck.environmental.service.WechatCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("pub")
public class WeChatCommentController {
    @Autowired
    private WechatCommentService wechatCommentService;

    @PostMapping("InsertWeChatComment")
    public JsonData InsertWeChatComment(@RequestBody WechatComment wechatComment)
    {
        wechatComment.setDate(new Date());
        return JsonData.buildSuccess(wechatCommentService.insertWechatComment(wechatComment));

    }

    @RequestMapping("findAllWeChatComment")
    public JsonData findAllWeChatComment()
    {
        return JsonData.buildSuccess(wechatCommentService.findAllWechatComment());
    }
}
