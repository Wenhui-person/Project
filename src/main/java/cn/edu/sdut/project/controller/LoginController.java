package cn.edu.sdut.project.controller;

import cn.edu.sdut.project.entity.User;
import cn.edu.sdut.project.service.CommodityService;
import cn.edu.sdut.project.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource
    private UserService userService;
    private CommodityService commodityService;
    public static final String SUCCESS="redirect:doCommodity";

    @RequestMapping("/")
    public String toLogin(){
        return "login/login";
    }

    @RequestMapping("doLogin")
    public String doLogin(User user,HttpSession session, ModelMap modelMap){
        User login=this.userService.login(user);
        if(login!=null) {
            session.setAttribute("user", login);
            return "main/index";
        }else{
            String msg="对不起，用户名或密码错误";
            modelMap.put("msg",msg);
            return "login/login";
        }
    }
    /***更新账户名称**/
    @RequestMapping("doHeader")
    public String doHeader(User user,ModelMap modelMap){
        User u=this.userService.login(user);
        modelMap.put("user",u);
        return "main/public_header";
    }
    @RequestMapping("toChangepwd")
    public String doChangepwd(User user,ModelMap modelMap){
        modelMap.put("user",user);
        return "header/change_psw";
    }
    @RequestMapping("doChangepwd")
    public String doChangepwd(User user){
        this.userService.updateUserpwd(user);
        System.out.println("测试doChangepwd");
        return SUCCESS;
    }

}
