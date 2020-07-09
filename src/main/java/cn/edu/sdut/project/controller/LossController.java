package cn.edu.sdut.project.controller;

import cn.edu.sdut.project.entity.Loss;
import cn.edu.sdut.project.service.LossService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LossController {

    @Resource
    private LossService lossService;

    @RequestMapping("baosun")
    public String baosun(){
        return "left/baosun";
    }

    @RequestMapping("baosun_add")
    public String baosun_add(){
        return "loss/baosun_add";
    }

    @RequestMapping("doLoss")
    public String doLoss(ModelMap modelMap){
        List<Loss> losses=this.lossService.queryLosses();
        modelMap.put("loss",losses);
        return "left/baosun";
    }
}
