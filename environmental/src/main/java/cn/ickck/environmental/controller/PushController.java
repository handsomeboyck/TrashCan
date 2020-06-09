package cn.ickck.environmental.controller;


import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.PushBean;
import cn.ickck.environmental.service.JiGuangPushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pub")
public class PushController {
    @Autowired
    private JiGuangPushService jiGuangPushService;

    /**
     * 群推，广播
     * @param title 推送标题
     * @param content 推送内容
     * @return
     */
    @PostMapping("/pushAll")
    public JsonData pushAll(@RequestParam String title, @RequestParam String content){
        PushBean pushBean = new PushBean();
        pushBean.setTitle(title);
        pushBean.setAlert(content);
        boolean flag = jiGuangPushService.pushAndroid(pushBean);
        return JsonData.buildSuccess(flag);
    }

    /**
     * 单独对regId进行推送
     * @param title 推送标题
     * @param regId 设备对应的唯一极光ID
     * @param content 推送内容
     * @return
     */
    @PostMapping("/push")
    public JsonData push(@RequestParam String title,@RequestParam String regId,@RequestParam String content){
        PushBean pushBean = new PushBean();
        pushBean.setTitle(title);
        pushBean.setAlert(content);
        boolean flag = jiGuangPushService.pushAndroid(pushBean, regId);
        return JsonData.buildSuccess(flag);
    }

}
