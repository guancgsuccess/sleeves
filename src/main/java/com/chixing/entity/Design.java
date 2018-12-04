package com.chixing.entity;

import java.io.Serializable;

/**
 * design
 * @author 
 */
public class Design implements Serializable {
    /**
     * 方案ID
     */
    private Integer designId;

    /**
     * 公司ID
     */
    private Integer designCompanyId;

    /**
     * 方案名称
     */
    private String designName;

    /**
     * 方案设计师ID
     */
    private Integer designDesignerId;

    /**
     * 户型
     */
    private String designHouseType;

    /**
     * 风格
     */
    private String designStyle;

    /**
     * 面积
     */
    private Double designArea;

    /**
     * 价格
     */
    private Double designPrice;

    /**
     * 工期
     */
    private Integer designDuration;

    /**
     * 简介
     */
    private String designIntroduction;

    /**
     * 冗余字段1
     */
    private String field1;

    /**
     * 冗余字段2
     */
    private String field2;

    private static final long serialVersionUID = 1L;

    public Design() {
    }

    public Design(Integer designId, Integer designCompanyId, String designName, Integer designDesignerId, String designHouseType, String designStyle, Double designArea, Double designPrice, Integer designDuration, String designIntroduction, String field1, String field2) {
        this.designId = designId;
        this.designCompanyId = designCompanyId;
        this.designName = designName;
        this.designDesignerId = designDesignerId;
        this.designHouseType = designHouseType;
        this.designStyle = designStyle;
        this.designArea = designArea;
        this.designPrice = designPrice;
        this.designDuration = designDuration;
        this.designIntroduction = designIntroduction;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Design(Integer designCompanyId, String designName, Integer designDesignerId, String designHouseType, String designStyle, Double designArea, Double designPrice, Integer designDuration, String designIntroduction, String field1, String field2) {
        this.designCompanyId = designCompanyId;
        this.designName = designName;
        this.designDesignerId = designDesignerId;
        this.designHouseType = designHouseType;
        this.designStyle = designStyle;
        this.designArea = designArea;
        this.designPrice = designPrice;
        this.designDuration = designDuration;
        this.designIntroduction = designIntroduction;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Integer getDesignId() {
        return designId;
    }

    public void setDesignId(Integer designId) {
        this.designId = designId;
    }

    public Integer getDesignCompanyId() {
        return designCompanyId;
    }

    public void setDesignCompanyId(Integer designCompanyId) {
        this.designCompanyId = designCompanyId;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public Integer getDesignDesignerId() {
        return designDesignerId;
    }

    public void setDesignDesignerId(Integer designDesignerId) {
        this.designDesignerId = designDesignerId;
    }

    public String getDesignHouseType() {
        return designHouseType;
    }

    public void setDesignHouseType(String designHouseType) {
        this.designHouseType = designHouseType;
    }

    public String getDesignStyle() {
        return designStyle;
    }

    public void setDesignStyle(String designStyle) {
        this.designStyle = designStyle;
    }

    public Double getDesignArea() {
        return designArea;
    }

    public void setDesignArea(Double designArea) {
        this.designArea = designArea;
    }

    public Double getDesignPrice() {
        return designPrice;
    }

    public void setDesignPrice(Double designPrice) {
        this.designPrice = designPrice;
    }

    public Integer getDesignDuration() {
        return designDuration;
    }

    public void setDesignDuration(Integer designDuration) {
        this.designDuration = designDuration;
    }

    public String getDesignIntroduction() {
        return designIntroduction;
    }

    public void setDesignIntroduction(String designIntroduction) {
        this.designIntroduction = designIntroduction;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
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
        Design other = (Design) that;
        return (this.getDesignId() == null ? other.getDesignId() == null : this.getDesignId().equals(other.getDesignId()))
            && (this.getDesignCompanyId() == null ? other.getDesignCompanyId() == null : this.getDesignCompanyId().equals(other.getDesignCompanyId()))
            && (this.getDesignName() == null ? other.getDesignName() == null : this.getDesignName().equals(other.getDesignName()))
            && (this.getDesignDesignerId() == null ? other.getDesignDesignerId() == null : this.getDesignDesignerId().equals(other.getDesignDesignerId()))
            && (this.getDesignHouseType() == null ? other.getDesignHouseType() == null : this.getDesignHouseType().equals(other.getDesignHouseType()))
            && (this.getDesignStyle() == null ? other.getDesignStyle() == null : this.getDesignStyle().equals(other.getDesignStyle()))
            && (this.getDesignArea() == null ? other.getDesignArea() == null : this.getDesignArea().equals(other.getDesignArea()))
            && (this.getDesignPrice() == null ? other.getDesignPrice() == null : this.getDesignPrice().equals(other.getDesignPrice()))
            && (this.getDesignDuration() == null ? other.getDesignDuration() == null : this.getDesignDuration().equals(other.getDesignDuration()))
            && (this.getDesignIntroduction() == null ? other.getDesignIntroduction() == null : this.getDesignIntroduction().equals(other.getDesignIntroduction()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDesignId() == null) ? 0 : getDesignId().hashCode());
        result = prime * result + ((getDesignCompanyId() == null) ? 0 : getDesignCompanyId().hashCode());
        result = prime * result + ((getDesignName() == null) ? 0 : getDesignName().hashCode());
        result = prime * result + ((getDesignDesignerId() == null) ? 0 : getDesignDesignerId().hashCode());
        result = prime * result + ((getDesignHouseType() == null) ? 0 : getDesignHouseType().hashCode());
        result = prime * result + ((getDesignStyle() == null) ? 0 : getDesignStyle().hashCode());
        result = prime * result + ((getDesignArea() == null) ? 0 : getDesignArea().hashCode());
        result = prime * result + ((getDesignPrice() == null) ? 0 : getDesignPrice().hashCode());
        result = prime * result + ((getDesignDuration() == null) ? 0 : getDesignDuration().hashCode());
        result = prime * result + ((getDesignIntroduction() == null) ? 0 : getDesignIntroduction().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", designId=").append(designId);
        sb.append(", designCompanyId=").append(designCompanyId);
        sb.append(", designName=").append(designName);
        sb.append(", designDesignerId=").append(designDesignerId);
        sb.append(", designHouseType=").append(designHouseType);
        sb.append(", designStyle=").append(designStyle);
        sb.append(", designArea=").append(designArea);
        sb.append(", designPrice=").append(designPrice);
        sb.append(", designDuration=").append(designDuration);
        sb.append(", designIntroduction=").append(designIntroduction);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}