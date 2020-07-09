package cn.edu.sdut.project.entity;

import java.util.Date;

public class Commodity {
    String commodityId,commodityTitle,commodityType;
    Date manuDate,groundDate;
    int qualityPeriod;

    public Commodity() {}

    public Commodity(String commodityId, String commodityTitle, String commodityType, Date manuDate, Date groundDate, int qualityPeriod) {
        this.commodityId = commodityId;
        this.commodityTitle = commodityTitle;
        this.commodityType = commodityType;
        this.manuDate = manuDate;
        this.groundDate = groundDate;
        this.qualityPeriod = qualityPeriod;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityTitle() {
        return commodityTitle;
    }

    public void setCommodityTitle(String commodityTitle) {
        this.commodityTitle = commodityTitle;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }

    public Date getManuDate() {
        return manuDate;
    }

    public void setManuDate(Date manuDate) {
        this.manuDate = manuDate;
    }

    public Date getGroundDate() {
        return groundDate;
    }

    public void setGroundDate(Date groundDate) {
        this.groundDate = groundDate;
    }

    public int getQualityPeriod() {
        return qualityPeriod;
    }

    public void setQualityPeriod(int qualityPeriod) {
        this.qualityPeriod = qualityPeriod;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityId='" + commodityId + '\'' +
                ", commodityTitle='" + commodityTitle + '\'' +
                ", commodityType='" + commodityType + '\'' +
                ", manuDate=" + manuDate +
                ", groundDate=" + groundDate +
                ", qualityPeriod=" + qualityPeriod +
                '}';
    }
}
