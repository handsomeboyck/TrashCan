package cn.ickck.environmental.provider;


import cn.ickck.environmental.domain.Admin;

import org.apache.ibatis.jdbc.SQL;

/**
 * admin更新接口动态构建sql
 */
public class AdminProvider {

    public String UpdateAdmin(final Admin admin)
    {
        return new SQL()
        {
            {
                UPDATE("admin");
                if(admin.getName()!=null)
                {
                    SET("name = #{name}");
                }
                if(admin.getPassword()!=null)
                {
                    SET("password = #{password}");
                }
                if(admin.getStatus()!=null)
                {
                    SET("status = #{status}");
                }
                if(admin.getTel()!=null)
                {
                    SET("tel = #{tel}");
                }
                if(admin.getUsername()!=null)
                {
                    SET("username = #{username}");
                }
                WHERE("id = #{id}");
            }
        }.toString();

    }

}
