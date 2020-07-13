package cn.edu.sdut.project.mapper;

import cn.edu.sdut.project.entity.Commodity;
import cn.edu.sdut.project.entity.User;

import java.util.List;

public interface CommodityMapper {
    List<Commodity> queryCommodityByname(Commodity commodity);
    List<Commodity> queryCommodities();
    int updateCommodity(Commodity com);
    int addCommodity(Commodity com);
    int deleteCommodity(String commodityId);
}
