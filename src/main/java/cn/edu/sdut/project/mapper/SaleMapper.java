package cn.edu.sdut.project.mapper;

import cn.edu.sdut.project.entity.Sale;

import java.util.List;

public interface SaleMapper {
    List<Sale> querySales();
    Sale querySalesById(int saleId);
    int updateSale(Sale sale);
    int deleteSale(int saleId);
}
