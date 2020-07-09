package cn.edu.sdut.project.commodity;

import cn.edu.sdut.project.ProjectApplicationTests;
import cn.edu.sdut.project.entity.Commodity;
import cn.edu.sdut.project.service.CommodityService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestCommodity extends ProjectApplicationTests {

    @Resource
    private CommodityService commodityService;

    @Test
    public void testQueryCommodityByname(){
        Commodity commodity=new Commodity();
        String name="纸";
        commodity.setCommodityTitle(name);
        List<Commodity> com=this.commodityService.queryCommodityByname(commodity);
        com.forEach(c-> System.out.println("c = " + c));
    }
    @Test
    public void testAddCommodity(){
        Commodity commodity=new Commodity("B109","丽芝士","饼干",null,null,8);
        int row=this.commodityService.addCommodity(commodity);
        print(row);
    }

}
