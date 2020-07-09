package cn.edu.sdut.project.sale;

import cn.edu.sdut.project.ProjectApplicationTests;
import cn.edu.sdut.project.entity.Sale;
import cn.edu.sdut.project.service.SaleService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestSale extends ProjectApplicationTests {
    
    @Resource
    private SaleService saleService;
    
    @Test
    public void testQuerySales(){
        List<Sale> sales=this.saleService.querySales();
        sales.forEach(s-> System.out.println("s = " + s));
    }
}
