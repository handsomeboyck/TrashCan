package cn.ickck.environmental.controller;



import cn.ickck.environmental.domain.JsonData;
import cn.ickck.environmental.domain.UserQuery;
import cn.ickck.environmental.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pub")
public class PublicController {

    @Autowired
    private AdminService adminService;



    /**
     * 返回需要登陆的页面
     * @return
     */
    @RequestMapping("need_login")
    public JsonData needLogin(){

        return JsonData.buildSuccess("温馨提示：请使用对应的账号登录",-2);

    }

    /**
     * @Descprition 测试连接,通过用户id查询用户
     * @param user_id
     * @return
     */
    @RequestMapping("test_connect")
    public JsonData test_connect(int user_id)
    {
//        List<Admin>lists =userService.findSimpleUserInfoById(user_id);
        return JsonData.buildSuccess(adminService.findSimpleUserInfoById(user_id));


    }



    /**
     * 拒绝访问界面
     * @return
     */

    @RequestMapping("not_permit")
    public JsonData notPermit(){

        return JsonData.buildSuccess("温馨提示：拒绝访问，没权限",-3);
    }




    /**
     * 登录接口
     * @param userQuery
     * @param request
     * @param response
     * @return
     */

    @PostMapping("login")
    public JsonData login(@RequestBody UserQuery userQuery, HttpServletRequest request, HttpServletResponse response){

        Subject subject = SecurityUtils.getSubject();
        Map<String,Object> info = new HashMap<>();
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userQuery.getName(), userQuery.getPwd());

            subject.login(usernamePasswordToken);

            info.put("msg","登录成功");
            info.put("session_id", subject.getSession().getId());

            return JsonData.buildSuccess(info);

        }catch (Exception e){
            e.printStackTrace();

            return JsonData.buildError("账号或者密码错误");

        }





    }




}
