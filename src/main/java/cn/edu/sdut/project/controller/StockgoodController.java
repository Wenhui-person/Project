package cn.edu.sdut.project.controller;

import cn.edu.sdut.project.entity.Stockgood;
import cn.edu.sdut.project.service.StockgoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StockgoodController {

    @Resource
    private StockgoodService stockgoodService;

    @RequestMapping("jinhuo")
    public String jinhuo(){
        return "left/jinhuo";
    }

    @RequestMapping("jinhuo_add")
    public String jinhuo_add(){
        return "stockgood/jinhuo_add";
    }
    @RequestMapping("doStockgood")
    public String doStockgood(ModelMap modelMap){
        List<Stockgood> sto=this.stockgoodService.queryStockgoods();
        modelMap.put("stockgood",sto);
        return "left/jinhuo";
    }
}
