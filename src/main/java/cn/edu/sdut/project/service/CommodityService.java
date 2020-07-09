package cn.edu.sdut.project.service;

import cn.edu.sdut.project.entity.Commodity;
import cn.edu.sdut.project.entity.User;

import java.util.List;

public interface CommodityService {
    List<Commodity> queryCommodityByname(Commodity commodity);
    List<Commodity> queryCommodities();
    int updateCommodity(Commodity com);
    int addCommodity(Commodity com);
    int deleteCommodity(int commodityId);
}
