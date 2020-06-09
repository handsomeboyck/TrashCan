package cn.ickck.environmental.domain;


//用于登陆的实体类
public class UserQuery {

    private String name;

    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
