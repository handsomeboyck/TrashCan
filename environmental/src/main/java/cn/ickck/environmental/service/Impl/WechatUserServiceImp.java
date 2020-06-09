package cn.ickck.environmental.service.Impl;

import cn.ickck.environmental.domain.WechatUser;
import cn.ickck.environmental.mapper.WeChatUserMapper;
import cn.ickck.environmental.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WechatUserServiceImp implements WechatUserService {
    @Autowired
    private WeChatUserMapper weChatUserMapper;

    @Override
    public Integer InsertWechatUser(WechatUser wechatUser) {
        return weChatUserMapper.InsertWechatUser(wechatUser);
    }

    @Override
    public Integer UpdateWechatUserPoints(String nickname) {
        return weChatUserMapper.UpdatePoints(nickname);
    }

    @Override
    public Integer findWeChatUserPoints(String nickname) {
        return weChatUserMapper.findPointsByNickName(nickname);
    }

    @Override
    public Integer CountByNickName(String nickname) {
        return weChatUserMapper.countByNickName(nickname);
    }
}
