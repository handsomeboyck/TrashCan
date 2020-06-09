package cn.ickck.environmental.domain;

import java.util.List;

/**
 * @ClassName Role
 * @Description TODO
 * @Author ck
 * @Date 2019/12/28 15:18
 * @Version 1.0
 **/
public class Role {
    int id;
    String name;
    String description;
    private List<Permission> permissionList;

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
