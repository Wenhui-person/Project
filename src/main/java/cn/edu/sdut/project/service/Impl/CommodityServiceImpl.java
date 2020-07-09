package cn.edu.sdut.project.service.Impl;

import cn.edu.sdut.project.entity.Commodity;
import cn.edu.sdut.project.mapper.CommodityMapper;
import cn.edu.sdut.project.service.CommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Resource
    public CommodityMapper commodityMapper;

    @Override
    public List<Commodity> queryCommodityByname(Commodity commodity) {
        return this.commodityMapper.queryCommodityByname(commodity);
    }

    @Override
    public List<Commodity> queryCommodities() {
        return this.commodityMapper.queryCommodities();
    }
    @Override
    public int updateCommodity(Commodity com) {
        return this.commodityMapper.updateCommodity(com);
    }

    @Override
    public int addCommodity(Commodity com) {
        return this.commodityMapper.addCommodity(com);
    }

    @Override
    public int deleteCommodity(int commodityId) {
        return this.commodityMapper.deleteCommodity(commodityId);
    }
}
