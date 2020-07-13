package cn.edu.sdut.project.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Commodity {
    private  String commodityId,commodityTitle,commodityType;
    /***格式化时间***/
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date manuDate;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date groundDate;
    private int qualityPeriod,sort;


    public Commodity() {}

    public Commodity(String commodityId, String commodityTitle, String commodityType, Date manuDate, Date groundDate, int qualityPeriod, int sort) {
        this.commodityId = commodityId;
        this.commodityTitle = commodityTitle;
        this.commodityType = commodityType;
        this.manuDate = manuDate;
        this.groundDate = groundDate;
        this.qualityPeriod = qualityPeriod;
        this.sort = sort;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
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
                ", sort=" + sort +
                '}';
    }
}
