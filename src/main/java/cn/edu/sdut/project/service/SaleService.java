package cn.edu.sdut.project.service;

import cn.edu.sdut.project.entity.Sale;

import java.util.List;

public interface SaleService {
    List<Sale> querySales();
    Sale querySalesById(int saleId);
    int updateSale(Sale sale);
    int deleteSale(int saleId);
}
