package cn.edu.sdut.project.stockgood;

import cn.edu.sdut.project.ProjectApplicationTests;
import cn.edu.sdut.project.entity.Stockgood;
import cn.edu.sdut.project.service.StockgoodService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestStockgood extends ProjectApplicationTests {
    
    @Resource
    private StockgoodService stockgoodService;
    
    @Test
    public void testQueryStockgoods(){
        List<Stockgood> stockgoods=this.stockgoodService.queryStockgoods();
        stockgoods.forEach(st-> System.out.println("st = " + st));
        
    }
}
