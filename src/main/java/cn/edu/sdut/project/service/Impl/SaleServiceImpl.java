package cn.edu.sdut.project.service.Impl;

import cn.edu.sdut.project.entity.Sale;
import cn.edu.sdut.project.mapper.SaleMapper;
import cn.edu.sdut.project.service.SaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Resource
    private SaleMapper saleMapper;

    @Override
    public List<Sale> querySales() {
        return this.saleMapper.querySales();
    }
}
