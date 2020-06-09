package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.WechatDeliever;

import java.util.List;

public interface WeChatDelieverService {
    //新增投递记录
   Integer insertWechatDeliver(WechatDeliever wechatDeliever);
   //查询投递记录
    List<WechatDeliever> findDeliverByNickName(String nickname);




}
