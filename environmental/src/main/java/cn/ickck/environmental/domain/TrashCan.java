package cn.ickck.environmental.domain;

/**
 * @ClassName TrashCan
 * @Description TODO
 * @Author ck
 * @Date 2019/12/28 19:05
 * @Version 1.0
 **/
public class TrashCan {
    private int id; //垃圾桶编号，数据库主键
    private String address; //垃圾桶地址
    private String status; //垃圾桶容量
    private String x; //地图横坐标
    private String y; //地图纵坐标
    private String health; //垃圾桶健康状态
    private Integer lable; //垃圾桶容量标识：49%以下为1,50%到79%为2,80%以上为3
    private String tel; //联系人电话
    private String  contact; //联系人姓名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public Integer getLable() {
        return lable;
    }

    public void setLable(Integer lable) {
        this.lable = lable;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
