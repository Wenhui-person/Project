package cn.edu.sdut.project.service.Impl;

import cn.edu.sdut.project.entity.Stockgood;
import cn.edu.sdut.project.mapper.StockgoodMapper;
import cn.edu.sdut.project.service.StockgoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockgoodServiceImpl implements StockgoodService {

    @Resource
    private StockgoodMapper stockgoodMapper;

    @Override
    public List<Stockgood> queryStockgoods() {
        return this.stockgoodMapper.queryStockgoods();
    }
}
