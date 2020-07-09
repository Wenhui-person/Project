package cn.edu.sdut.project.controller;

import cn.edu.sdut.project.entity.Sale;
import cn.edu.sdut.project.service.SaleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SaleController {

    @Resource
    private SaleService saleService;


    @RequestMapping("xiaoshouxinxi")
    public String xiaoshouxinxi(){
        return "left/xiaoshouxinxi";
    }

    @RequestMapping("xiaoshou_add")
    public String xiaoshou_add(){
        return "salemanage/xiaoshou_add";
    }

    @RequestMapping("doSale")
    public String doSale(ModelMap modelMap){
        List<Sale> sales=this.saleService.querySales();
        modelMap.put("xiaoshou",sales);
        return "left/xiaoshouxinxi";
    }
}
