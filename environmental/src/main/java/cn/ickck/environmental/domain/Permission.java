package cn.ickck.environmental.domain;

/**
 * @ClassName Permission
 * @Description TODO
 * @Author ck
 * @Date 2019/12/28 15:19
 * @Version 1.0
 **/
public class Permission {
    private  int id;
    private  String name;
    private  String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
