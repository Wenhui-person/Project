package cn.edu.sdut.project.stock;

import cn.edu.sdut.project.ProjectApplicationTests;
import cn.edu.sdut.project.entity.Stock;
import cn.edu.sdut.project.service.StockService;
import org.junit.Test;
import org.springframework.util.FileCopyUtils;

import javax.annotation.Resource;
import java.util.List;

public class TestStock extends ProjectApplicationTests {
    @Resource
    private StockService stockService;
    
    @Test
    public void testQueryStocks(){
        List<Stock> stocks=this.stockService.queryStocks();
        stocks.forEach(s-> System.out.println("s = " + s));
    }
}
