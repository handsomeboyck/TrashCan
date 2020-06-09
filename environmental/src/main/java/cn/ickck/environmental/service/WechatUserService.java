package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.WechatUser;

public interface WechatUserService {

    //新增微信用户
    Integer InsertWechatUser(WechatUser wechatUser);
    //更新用户积分 +1
    Integer UpdateWechatUserPoints(String nickname);
    //查询用户积分
    Integer findWeChatUserPoints(String nickname);

    //查询当前用户是否存在
    Integer CountByNickName(String nickname);
}
