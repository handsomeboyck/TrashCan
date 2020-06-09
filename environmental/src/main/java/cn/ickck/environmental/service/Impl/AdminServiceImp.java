package cn.ickck.environmental.service.Impl;

import cn.ickck.environmental.domain.Admin;
import cn.ickck.environmental.domain.Role;
import cn.ickck.environmental.mapper.RoleMapper;
import cn.ickck.environmental.mapper.AdminMapper;
import cn.ickck.environmental.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImp
 * @Description TODO
 * @Author ck
 * @Date 2019/12/28 15:52
 * @Version 1.0
 **/
@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin findAllUserInfoByUsername(String username) {
        Admin user = adminMapper.findByname(username);

        //用户的角色集合
        List<Role> roleList =  roleMapper.findRoleListByUserId(user.getId());


        user.setRoleList(roleList);

        return user;
    }

    @Override
    public List<Admin> findAllAdminInfo() {
        return adminMapper.findAllAdminInfo();
    }

    @Override
    public Admin findSimpleUserInfoById(int userId) {
        return adminMapper.findById(userId);
    }


    @Override
    public Admin findSimpleUserInfoByUsername(String username) {
        return adminMapper.findByname(username);
    }

    @Override
    public Integer insertAdmin(Admin admin) {
        return adminMapper.insertAdmin(admin);
    }

    @Override
    public void UpdateAdmin(Admin admin) {
        adminMapper.UpdateAdmin(admin);
    }

    @Override
    public Integer deleteAdmin(Integer id) {
        return adminMapper.DeleteAdmin(id);
    }


}
