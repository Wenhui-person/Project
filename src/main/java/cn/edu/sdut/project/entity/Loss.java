package cn.edu.sdut.project.entity;

import java.util.Date;

public class Loss {
    int lossId;
    String commodityId;
    Date lossDate;
    int lossNum;
    String state;

    public Loss() {
    }

    public Loss(int lossId, String commodityId, Date lossDate, int lossNum, String state) {
        this.lossId = lossId;
        this.commodityId = commodityId;
        this.lossDate = lossDate;
        this.lossNum = lossNum;
        this.state = state;
    }

    public int getLossId() {
        return lossId;
    }

    public void setLossId(int lossId) {
        this.lossId = lossId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Date getLossDate() {
        return lossDate;
    }

    public void setLossDate(Date lossDate) {
        this.lossDate = lossDate;
    }

    public int getLossNum() {
        return lossNum;
    }

    public void setLossNum(int lossNum) {
        this.lossNum = lossNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Loss{" +
                "lossId=" + lossId +
                ", commodityId='" + commodityId + '\'' +
                ", lossDate=" + lossDate +
                ", lossNum=" + lossNum +
                ", state='" + state + '\'' +
                '}';
    }
}
