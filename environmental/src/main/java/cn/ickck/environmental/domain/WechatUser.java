package cn.ickck.environmental.domain;
/*
 微信用户实体类
 */
public class WechatUser {
    private Integer id;
    private String nickname; //昵称
    private Integer points; //积分

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

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}

