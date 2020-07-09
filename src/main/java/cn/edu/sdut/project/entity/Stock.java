package cn.edu.sdut.project.entity;

import java.util.Date;

public class Stock {
    int stockId,stockNum;
    String commodityId,stockState,signer;
    Date inoutwareDate;

    public Stock() {
    }

    public Stock(int stockId, int stockNum, String commodityId, String stockState, String signer, Date inoutwareDate) {
        this.stockId = stockId;
        this.stockNum = stockNum;
        this.commodityId = commodityId;
        this.stockState = stockState;
        this.signer = signer;
        this.inoutwareDate = inoutwareDate;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getStockState() {
        return stockState;
    }

    public void setStockState(String stockState) {
        this.stockState = stockState;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public Date getInoutwareDate() {
        return inoutwareDate;
    }

    public void setInoutwareDate(Date inoutwareDate) {
        this.inoutwareDate = inoutwareDate;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", stockNum=" + stockNum +
                ", commodityId='" + commodityId + '\'' +
                ", stockState='" + stockState + '\'' +
                ", signer='" + signer + '\'' +
                ", inoutwareDate=" + inoutwareDate +
                '}';
    }
}
