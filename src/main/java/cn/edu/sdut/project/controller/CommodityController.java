package cn.edu.sdut.project.controller;

import cn.edu.sdut.project.entity.Commodity;
import cn.edu.sdut.project.service.CommodityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CommodityController {

    @Resource
    private CommodityService commodityService;
    public static final String SUCCESS="redirect:doCommodity";

    @RequestMapping("doCommodity")
    public String doCommodity(ModelMap modelMap){
        List<Commodity> commodities=this.commodityService.queryCommodities();
        modelMap.put("com",commodities);
        return "main/shangpinxinxi";
    }

    @RequestMapping("toCommodity_add")
    public String toCommodity_add(){
        return "commodity/commodity_add";
    }
    @RequestMapping("doCommodity_add")
    public String doCommodity_add(Commodity commodity){
        this.commodityService.addCommodity(commodity);
        return SUCCESS;
    }

    @RequestMapping("doSelectCommodity")
    public String doSelectCommodity(Commodity commodity,ModelMap modelMap){
        List<Commodity> commodities=this.commodityService.queryCommodityByname(commodity);
        modelMap.put("com",commodities);
        return "main/shangpinxinxi";
    }

}
