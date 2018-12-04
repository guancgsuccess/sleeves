package com.chixing.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * reiders
 * @author 
 */
public class Raiders implements Serializable {
    /**
     * 攻略id
     */
    private Integer raidersId;

    /**
     * 攻略标题
     */
    private String raidersTitle;

    /**
     * 攻略图片路径
     */
    private String raidersImgPath;

    /**
     * 
攻略介绍
     */
    private String raidersIntroduce;

    /**
     * 攻略内容1
     */
    private String raidersContent1;

    /**
     * 攻略内容2
     */
    private String raidersContent2;

    /**
     * 攻略内容3
     */
    private String raidersContent3;

    /**
     * 攻略内容4
     */
    private String raidersContent4;

    /**
     * 攻略时间
     */
    private Date raidersDate;

    //攻略点赞数目
    private Integer raidersPraise;
    //攻略收藏数目
    private Integer collectNumber;

    private static final long serialVersionUID = 1L;

    public Raiders() {
    }

    public Raiders(Integer raidersId, String raidersTitle, String raidersImgPath, String raidersIntroduce, String raidersContent1, String raidersContent2, String raidersContent3, String raidersContent4, Date raidersDate, Integer raidersPraise, Integer collectNumber) {
        this.raidersId = raidersId;
        this.raidersTitle = raidersTitle;
        this.raidersImgPath = raidersImgPath;
        this.raidersIntroduce = raidersIntroduce;
        this.raidersContent1 = raidersContent1;
        this.raidersContent2 = raidersContent2;
        this.raidersContent3 = raidersContent3;
        this.raidersContent4 = raidersContent4;
        this.raidersDate = raidersDate;
        this.raidersPraise = raidersPraise;
        this.collectNumber = collectNumber;
    }

    public Integer getRaidersId() {
        return raidersId;
    }

    public void setRaidersId(Integer raidersId) {
        this.raidersId = raidersId;
    }

    public String getRaidersTitle() {
        return raidersTitle;
    }

    public void setRaidersTitle(String raidersTitle) {
        this.raidersTitle = raidersTitle;
    }

    public String getRaidersImgPath() {
        return raidersImgPath;
    }

    public void setRaidersImgPath(String raidersImgPath) {
        this.raidersImgPath = raidersImgPath;
    }

    public String getRaidersIntroduce() {
        return raidersIntroduce;
    }

    public void setRaidersIntroduce(String raidersIntroduce) {
        this.raidersIntroduce = raidersIntroduce;
    }

    public String getRaidersContent1() {
        return raidersContent1;
    }

    public void setRaidersContent1(String raidersContent1) {
        this.raidersContent1 = raidersContent1;
    }

    public String getRaidersContent2() {
        return raidersContent2;
    }

    public void setRaidersContent2(String raidersContent2) {
        this.raidersContent2 = raidersContent2;
    }

    public String getRaidersContent3() {
        return raidersContent3;
    }

    public void setRaidersContent3(String raidersContent3) {
        this.raidersContent3 = raidersContent3;
    }

    public String getRaidersContent4() {
        return raidersContent4;
    }

    public void setRaidersContent4(String raidersContent4) {
        this.raidersContent4 = raidersContent4;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone="Asia/Shanghai")
    public Date getRaidersDate() {
        return raidersDate;
    }

    public void setRaidersDate(Date raidersDate) {
        this.raidersDate = raidersDate;
    }

    public Integer getRaidersPraise() {
        return raidersPraise;
    }

    public void setRaidersPraise(Integer raidersPraise) {
        this.raidersPraise = raidersPraise;
    }

    public Integer getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(Integer collectNumber) {
        this.collectNumber = collectNumber;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Raiders other = (Raiders) that;
        return (this.getRaidersId() == null ? other.getRaidersId() == null : this.getRaidersId().equals(other.getRaidersId()))
            && (this.getRaidersTitle() == null ? other.getRaidersTitle() == null : this.getRaidersTitle().equals(other.getRaidersTitle()))
            && (this.getRaidersImgPath() == null ? other.getRaidersImgPath() == null : this.getRaidersImgPath().equals(other.getRaidersImgPath()))
            && (this.getRaidersIntroduce() == null ? other.getRaidersIntroduce() == null : this.getRaidersIntroduce().equals(other.getRaidersIntroduce()))
            && (this.getRaidersContent1() == null ? other.getRaidersContent1() == null : this.getRaidersContent1().equals(other.getRaidersContent1()))
            && (this.getRaidersContent2() == null ? other.getRaidersContent2() == null : this.getRaidersContent2().equals(other.getRaidersContent2()))
            && (this.getRaidersContent3() == null ? other.getRaidersContent3() == null : this.getRaidersContent3().equals(other.getRaidersContent3()))
            && (this.getRaidersContent4() == null ? other.getRaidersContent4() == null : this.getRaidersContent4().equals(other.getRaidersContent4()))
            && (this.getRaidersDate() == null ? other.getRaidersDate() == null : this.getRaidersDate().equals(other.getRaidersDate()))
            && (this.getRaidersPraise() == null ? other.getRaidersPraise() == null : this.getRaidersPraise().equals(other.getRaidersPraise()))
            && (this.getCollectNumber() == null ? other.getCollectNumber() == null : this.getCollectNumber().equals(other.getCollectNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRaidersTitle() == null) ? 0 : getRaidersTitle().hashCode());
        result = prime * result + ((getRaidersImgPath() == null) ? 0 : getRaidersImgPath().hashCode());
        result = prime * result + ((getRaidersIntroduce() == null) ? 0 : getRaidersIntroduce().hashCode());
        result = prime * result + ((getRaidersContent1() == null) ? 0 : getRaidersContent1().hashCode());
        result = prime * result + ((getRaidersContent2() == null) ? 0 : getRaidersContent2().hashCode());
        result = prime * result + ((getRaidersContent3() == null) ? 0 : getRaidersContent3().hashCode());
        result = prime * result + ((getRaidersContent4() == null) ? 0 : getRaidersContent4().hashCode());
        result = prime * result + ((getRaidersDate() == null) ? 0 : getRaidersDate().hashCode());
        result = prime * result + ((getRaidersPraise() == null) ? 0 : getRaidersPraise().hashCode());
        result = prime * result + ((getCollectNumber() == null) ? 0 : getCollectNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", raidersId=").append(raidersId);
        sb.append(", raidersTitle=").append(raidersTitle);
        sb.append(", raidersImgPath=").append(raidersImgPath);
        sb.append(", raidersIntroduce=").append(raidersIntroduce);
        sb.append(", raidersContent1=").append(raidersContent1);
        sb.append(", raidersContent2=").append(raidersContent2);
        sb.append(", raidersContent3=").append(raidersContent3);
        sb.append(", raidersContent4=").append(raidersContent4);
        sb.append(", raidersDate=").append(raidersDate);
        sb.append(", raidersPraise=").append(raidersPraise);
        sb.append(", collectNumber=").append(collectNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}