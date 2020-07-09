package cn.edu.sdut.project.controller;

import cn.edu.sdut.project.entity.Stock;
import cn.edu.sdut.project.service.StockService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class KucunController {

    @Resource
    private StockService stockService;

    @RequestMapping("kucun_add")
    public String kuncun_add(){
        return "kucunmanage/kucun_add";
    }
    @RequestMapping("shangpinkucun")
    public String shangpinkucun(){
        return "left/shangpinkucun";
    }

    @RequestMapping("doStock")
    public String doStock(ModelMap modelMap){
        List<Stock> stocks=this.stockService.queryStocks();
        modelMap.put("stock",stocks);
        return "left/shangpinkucun";
    }
}
