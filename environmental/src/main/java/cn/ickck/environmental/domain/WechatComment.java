package cn.ickck.environmental.domain;

import java.util.Date;

/*
 微信用户评论
 */
public class WechatComment {

    private Integer id;
    private String nickname; //评论人昵称
    private Date date; //评论时间
    private String content; //评论内容

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
