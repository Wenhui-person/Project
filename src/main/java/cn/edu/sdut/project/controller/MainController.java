package cn.edu.sdut.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("public_header")
    public String public_header(){
        return "main/public_header";
    }

    @RequestMapping("public_left")
    public String public_left(){
        return "main/public_left";
    }

    @RequestMapping("shangpinxinxi")
    public String shangpinxinxi(){
        return "main/shangpinxinxi";
    }

    @RequestMapping("change_psw")
    public String change_psw(){
        return "header/change_psw";
    }


}
