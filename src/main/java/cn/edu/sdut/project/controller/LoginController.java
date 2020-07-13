package cn.edu.sdut.project.controller;

import cn.edu.sdut.project.entity.User;
import cn.edu.sdut.project.service.CommodityService;
import cn.edu.sdut.project.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String toChangepwd(@RequestParam(value = "password") String password, @RequestParam(value = "userid") String userid,
            ModelMap modelMap){
        modelMap.put("oldpassword",password);
        modelMap.put("userid",userid);
        System.out.println("oldpassword = " + password);
        return "header/change_psw";
    }
    @RequestMapping("doChangepwd")
    public String doChangepwd(@RequestParam(value = "userid") String userid,String password){
        User user=new User(userid,password);
        this.userService.updateUserpwd(user);
        return SUCCESS;
    }
    @RequestMapping("toRegister")
    public String toRegister(){
        return "login/register";
    }
    @RequestMapping("doRegister")
    public String doRegister(User user){
        this.userService.addUser(user);
        return "login/login";
    }

}
