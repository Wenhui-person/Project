package cn.edu.sdut.project.service.Impl;

import cn.edu.sdut.project.entity.Stock;
import cn.edu.sdut.project.mapper.StockMapper;
import cn.edu.sdut.project.service.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Resource
    private StockMapper stockMapper;

    @Override
    public List<Stock> queryStocks() {
        return this.stockMapper.queryStocks();
    }
}
