package com.chixing.entity;

import java.io.Serializable;

/**
 * rendering
 * @author 
 */
public class Rendering implements Serializable {
    /**
     * 效果图id
     */
    private Integer renderingId;

    /**
     * 设计方案id
     */
    private Integer renderingDesignId;

    /**
     * 效果图描述
     */
    private String renderingDescription;

    /**
     * 户型
     */
    private String renderingHouseType;

    /**
     * 风格
     */
    private String renderingStyle;

    /**
     * 面积
面积
     */
    private Float renderingArea;

    /**
     * 效果图好评
     */
    private Integer renderingPraise;

    /**
     * 效果图状态
     */
    private Integer renderingStatus;

    /**
     * 冗余字段1
     */
    private String filed1;

    /**
     * 冗余字段2
     */
    private Integer fileds;

    private static final long serialVersionUID = 1L;

    public Integer getRenderingId() {
        return renderingId;
    }

    public void setRenderingId(Integer renderingId) {
        this.renderingId = renderingId;
    }

    public Integer getRenderingDesignId() {
        return renderingDesignId;
    }

    public void setRenderingDesignId(Integer renderingDesignId) {
        this.renderingDesignId = renderingDesignId;
    }

    public String getRenderingDescription() {
        return renderingDescription;
    }

    public void setRenderingDescription(String renderingDescription) {
        this.renderingDescription = renderingDescription;
    }

    public String getRenderingHouseType() {
        return renderingHouseType;
    }

    public void setRenderingHouseType(String renderingHouseType) {
        this.renderingHouseType = renderingHouseType;
    }

    public String getRenderingStyle() {
        return renderingStyle;
    }

    public void setRenderingStyle(String renderingStyle) {
        this.renderingStyle = renderingStyle;
    }

    public Float getRenderingArea() {
        return renderingArea;
    }

    public void setRenderingArea(Float renderingArea) {
        this.renderingArea = renderingArea;
    }

    public Integer getRenderingPraise() {
        return renderingPraise;
    }

    public void setRenderingPraise(Integer renderingPraise) {
        this.renderingPraise = renderingPraise;
    }

    public Integer getRenderingStatus() {
        return renderingStatus;
    }

    public void setRenderingStatus(Integer renderingStatus) {
        this.renderingStatus = renderingStatus;
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    public Integer getFileds() {
        return fileds;
    }

    public void setFileds(Integer fileds) {
        this.fileds = fileds;
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
        Rendering other = (Rendering) that;
        return (this.getRenderingId() == null ? other.getRenderingId() == null : this.getRenderingId().equals(other.getRenderingId()))
            && (this.getRenderingDesignId() == null ? other.getRenderingDesignId() == null : this.getRenderingDesignId().equals(other.getRenderingDesignId()))
            && (this.getRenderingDescription() == null ? other.getRenderingDescription() == null : this.getRenderingDescription().equals(other.getRenderingDescription()))
            && (this.getRenderingHouseType() == null ? other.getRenderingHouseType() == null : this.getRenderingHouseType().equals(other.getRenderingHouseType()))
            && (this.getRenderingStyle() == null ? other.getRenderingStyle() == null : this.getRenderingStyle().equals(other.getRenderingStyle()))
            && (this.getRenderingArea() == null ? other.getRenderingArea() == null : this.getRenderingArea().equals(other.getRenderingArea()))
            && (this.getRenderingPraise() == null ? other.getRenderingPraise() == null : this.getRenderingPraise().equals(other.getRenderingPraise()))
            && (this.getRenderingStatus() == null ? other.getRenderingStatus() == null : this.getRenderingStatus().equals(other.getRenderingStatus()))
            && (this.getFiled1() == null ? other.getFiled1() == null : this.getFiled1().equals(other.getFiled1()))
            && (this.getFileds() == null ? other.getFileds() == null : this.getFileds().equals(other.getFileds()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRenderingId() == null) ? 0 : getRenderingId().hashCode());
        result = prime * result + ((getRenderingDesignId() == null) ? 0 : getRenderingDesignId().hashCode());
        result = prime * result + ((getRenderingDescription() == null) ? 0 : getRenderingDescription().hashCode());
        result = prime * result + ((getRenderingHouseType() == null) ? 0 : getRenderingHouseType().hashCode());
        result = prime * result + ((getRenderingStyle() == null) ? 0 : getRenderingStyle().hashCode());
        result = prime * result + ((getRenderingArea() == null) ? 0 : getRenderingArea().hashCode());
        result = prime * result + ((getRenderingPraise() == null) ? 0 : getRenderingPraise().hashCode());
        result = prime * result + ((getRenderingStatus() == null) ? 0 : getRenderingStatus().hashCode());
        result = prime * result + ((getFiled1() == null) ? 0 : getFiled1().hashCode());
        result = prime * result + ((getFileds() == null) ? 0 : getFileds().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", renderingId=").append(renderingId);
        sb.append(", renderingDesignId=").append(renderingDesignId);
        sb.append(", renderingDescription=").append(renderingDescription);
        sb.append(", renderingHouseType=").append(renderingHouseType);
        sb.append(", renderingStyle=").append(renderingStyle);
        sb.append(", renderingArea=").append(renderingArea);
        sb.append(", renderingPraise=").append(renderingPraise);
        sb.append(", renderingStatus=").append(renderingStatus);
        sb.append(", filed1=").append(filed1);
        sb.append(", fileds=").append(fileds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}