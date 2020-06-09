package cn.ickck.environmental.service;

import cn.ickck.environmental.domain.Admin;

import java.util.List;


public interface AdminService {

       /**
        * 获取全部用户信息，包括角色，权限
        * @param username
        * @return
        */
       Admin findAllUserInfoByUsername(String username);



       Admin findSimpleUserInfoById(int userId);


       List<Admin> findAllAdminInfo();


       /**
        * 根据用户名查找用户信息
        * @param username
        * @return
        */
       Admin findSimpleUserInfoByUsername(String username);

       /*
         管理员信息插入
        */
       Integer insertAdmin(Admin admin);

      /*
          管理员信息更新接口
       */
       void UpdateAdmin(Admin admin);

       /*
       管理员信息删除接口
        */
       Integer deleteAdmin(Integer id);
}
