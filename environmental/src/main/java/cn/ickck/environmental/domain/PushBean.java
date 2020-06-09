package cn.ickck.environmental.domain;

/*
  极光推送实体类
 */

import java.util.Map;

public class PushBean {

    private String alert;
    // 可选, 附加信息, 供业务使用。
    private Map<String, String> extras;
    //android专用// 可选, 通知标题,如果指定了，则通知里原来展示 App名称的地方，将展示成这个字段。
    private String title;

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public Map<String, String> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, String> extras) {
        this.extras = extras;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
