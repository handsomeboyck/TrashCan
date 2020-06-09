package cn.ickck.environmental.controller;

import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.WechatUser;
import cn.ickck.environmental.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pub")
public class WechatUserController {
    @Autowired
    private WechatUserService wechatUserService;


    @PostMapping("insertWechatUser")
    public JsonData InsertWechatUser(@RequestBody WechatUser wechatUser)
    {
        System.out.println("++++++"+wechatUserService.CountByNickName(wechatUser.getNickname()));


        if(wechatUserService.CountByNickName(wechatUser.getNickname())==0)
        {
            wechatUser.setPoints(0);
            return JsonData.buildSuccess(wechatUserService.InsertWechatUser(wechatUser));

        }

        else
            return JsonData.buildError("该用户已存在");

    }


    @RequestMapping("findPointsByNickName")
    public JsonData findPointsByNickName(String nickname)
    {
        return JsonData.buildSuccess(wechatUserService.findWeChatUserPoints(nickname));
    }



}
