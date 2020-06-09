package cn.ickck.environmental.service.Impl;

import cn.ickck.environmental.domain.WechatDeliever;
import cn.ickck.environmental.mapper.WechatDelieverMapper;
import cn.ickck.environmental.service.WeChatDelieverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeChatDeliverServiceImp implements WeChatDelieverService {

    @Autowired
    private WechatDelieverMapper wechatDelieverMapper;
    @Override
    public Integer insertWechatDeliver(WechatDeliever wechatDeliever) {
        return wechatDelieverMapper.InsertWechatDeliver(wechatDeliever);
    }

    @Override
    public List<WechatDeliever> findDeliverByNickName(String nickname) {
        return wechatDelieverMapper.findDeliverByNickName(nickname);
    }
}
