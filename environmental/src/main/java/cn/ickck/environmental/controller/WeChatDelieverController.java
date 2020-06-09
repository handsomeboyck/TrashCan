package cn.ickck.environmental.controller;

import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.WechatDeliever;
import cn.ickck.environmental.service.WeChatDelieverService;
import cn.ickck.environmental.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("pub")
public class WeChatDelieverController {
    @Autowired
    private WeChatDelieverService weChatDelieverService;

    @Autowired
    private WechatUserService wechatUserService;






    @PostMapping("insertWeChatDeliver")
    public JsonData InsertDeliever(@RequestBody WechatDeliever wechatDeliever)
    {
        //积分加1
        wechatUserService.UpdateWechatUserPoints(wechatDeliever.getNickname());
        wechatDeliever.setDate(new Date());
        //识别开始
        wechatDeliever.setResult("识别结果开发中");
        //识别结束
        weChatDelieverService.insertWechatDeliver(wechatDeliever);
        return JsonData.buildSuccess(wechatDeliever.getResult());
    }
    @RequestMapping("findDeliverByNickName")
    public JsonData findDeliverByNickName(String nickname)
    {
        return JsonData.buildSuccess(weChatDelieverService.findDeliverByNickName(nickname));

    }

}
