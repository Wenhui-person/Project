package cn.edu.sdut.project.loss;

import cn.edu.sdut.project.ProjectApplicationTests;
import cn.edu.sdut.project.entity.Loss;
import cn.edu.sdut.project.service.LossService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestLoss extends ProjectApplicationTests {
    @Resource
    private LossService lossService;
    
    @Test
    public void testQueryLosses(){
        List<Loss> losses=this.lossService.queryLosses();
        losses.forEach(l-> System.out.println("l = " + l));
    }
}
