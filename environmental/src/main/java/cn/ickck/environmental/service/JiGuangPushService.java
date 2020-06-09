package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.PushBean;

/*
 极光推送服务
 封装推送服务相关
 */
public interface JiGuangPushService {
    boolean pushAll(PushBean pushBean);

    boolean pushIos(PushBean pushBean);

    boolean pushIos(PushBean pushBean, String... registids);

    boolean pushAndroid(PushBean pushBean);

    boolean pushAndroid(PushBean pushBean, String... registids);

    String[] checkRegistids(String[] registids);

}
