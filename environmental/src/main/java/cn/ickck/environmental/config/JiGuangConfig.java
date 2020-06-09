package cn.ickck.environmental.config;

import cn.jpush.api.JPushClient;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

//@ConfigurationProperties
@Configuration
public class JiGuangConfig {

//    @Value("${push.appkey}")
    private String appkey ="4b7558c247c51cc5ef4ac953";
    // 极光官网-个人管理中心-点击查看-secret
//    @Value("${push.secret}")
    private String secret ="0e47279427224ad45fd4f8cc";
    private JPushClient jPushClient;
    // 推送客户端
    @PostConstruct
    public void initJPushClient() {
        jPushClient = new JPushClient(secret, appkey);
    }
    // 获取推送客户端
    public JPushClient getJPushClient() {
        return jPushClient;
    }


}
