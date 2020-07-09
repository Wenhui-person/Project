package cn.edu.sdut.project.entity;

import java.util.Date;

public class Stockgood {
    int stockgoodId;
    String commodityId;
    Date inDate;
    double inPrice;
    int stockgoodNum;
    String buyer;

    public Stockgood() {
    }

    public Stockgood(int stockgoodId, String commodityId, Date inDate, double inPrice, int stockgoodNum, String buyer) {
        this.stockgoodId = stockgoodId;
        this.commodityId = commodityId;
        this.inDate = inDate;
        this.inPrice = inPrice;
        this.stockgoodNum = stockgoodNum;
        this.buyer = buyer;
    }

    public int getStockgoodId() {
        return stockgoodId;
    }

    public void setStockgoodId(int stockgoodId) {
        this.stockgoodId = stockgoodId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public double getInPrice() {
        return inPrice;
    }

    public void setInPrice(double inPrice) {
        this.inPrice = inPrice;
    }

    public int getStockgoodNum() {
        return stockgoodNum;
    }

    public void setStockgoodNum(int stockgoodNum) {
        this.stockgoodNum = stockgoodNum;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Stockgood{" +
                "stockgoodId=" + stockgoodId +
                ", commodityId='" + commodityId + '\'' +
                ", inDate=" + inDate +
                ", inPrice=" + inPrice +
                ", stockgoodNum=" + stockgoodNum +
                ", buyer='" + buyer + '\'' +
                '}';
    }
}
