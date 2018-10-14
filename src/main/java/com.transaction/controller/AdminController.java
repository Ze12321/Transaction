package com.transaction.controller;

import com.transaction.model.JsonBean;
import com.transaction.model.User;
import com.transaction.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "admin/")
public class AdminController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public JsonBean update(User admin, HttpSession session) {
        User loginadmin=userService.selectUser(1);
        System.out.println(admin);
        System.out.println(admin.getName()+admin.getPassword()+"名字和密码");
        if(admin==null||admin.equals("")){
            System.out.println("登陆失败");
            return JsonBean.wrong("登陆失败");
        }else{
            if(userService.login(admin)==null){
                System.out.println(admin);
            }
            System.out.println(admin);
            return JsonBean.correct("登陆成功");
        }
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "index")
    public String index(){
        return "/login/login";
    }

    @RequestMapping(value = "logout")
    public String logout(HttpSession session){
        session.removeAttribute("admin");
        return "Backstage/login.html";
    }


}
