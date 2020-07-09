package cn.edu.sdut.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryController {

    @RequestMapping("xinxipandian")
    public String xinxipandian(){
        return "left/xinxipandian";
    }

}
