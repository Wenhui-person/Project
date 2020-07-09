package cn.edu.sdut.project.entity;

import java.util.Date;

public class Sale {
    int saleId,saleNum;
    double salePrice;
    String commodityId;
    Date saleDate;

    public Sale() {}

    public Sale(int saleId, int saleNum, double salePrice, String commodityId, Date saleDate) {
        this.saleId = saleId;
        this.saleNum = saleNum;
        this.salePrice = salePrice;
        this.commodityId = commodityId;
        this.saleDate = saleDate;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", saleNum=" + saleNum +
                ", salePrice=" + salePrice +
                ", commodityId='" + commodityId + '\'' +
                ", saleDate=" + saleDate +
                '}';
    }
}
