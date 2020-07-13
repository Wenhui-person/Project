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
    public static final String SUCCESS="redirect:doSale";


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
    /**销售详情查看**/
    @RequestMapping("doSaleDetail")
    public String doSaleDetail(int saleId,ModelMap modelMap){
        Sale sales=this.saleService.querySalesById(saleId);
        modelMap.put("sale",sales);
        return "salemanage/saleDetail";
    }
    /**销售信息修改**/
    @RequestMapping("toSaleChange")
    public String toSaleChange(int saleId,ModelMap modelMap){
        modelMap.put("saleId",saleId);
        return "salemanage/xiaoshou_change";
    }
    @RequestMapping("doSaleChange")
    public String doSaleChange(Sale sale,int saleId){
        sale.setSaleId(saleId);
        this.saleService.updateSale(sale);
        return SUCCESS;
    }
    /**删除销售信息**/
    @RequestMapping("doDeleteSale")
    public String doDeleteSale(int saleId){
        this.saleService.deleteSale(saleId);
        return SUCCESS;
    }
}
