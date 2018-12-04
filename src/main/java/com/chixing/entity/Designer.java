package com.chixing.entity;

import java.io.Serializable;

/**
 * designer
 * @author 
 */
public class Designer implements Serializable {
    /**
     * 设计师ID
     */
    private Integer designerId;

    /**
     * 设计师姓名
     */
    private String designerName;

    /**
     * 设计师头像
     */
    private String designerImgPath;

    /**
     * 设计师简介
     */
    private String designerIntroduction;

    /**
     * 设计师风格
     */
    private String designerStyle;

    /**
     * 冗余字段1
     */
    private String fields;

    /**
     * 冗余字段2
     */
    private Integer fields1;

    private static final long serialVersionUID = 1L;

    public Designer() {
    }

    public Designer(Integer designerId, String designerName, String designerImgPath, String designerIntroduction, String designerStyle, String fields, Integer fields1) {
        this.designerId = designerId;
        this.designerName = designerName;
        this.designerImgPath = designerImgPath;
        this.designerIntroduction = designerIntroduction;
        this.designerStyle = designerStyle;
        this.fields = fields;
        this.fields1 = fields1;
    }

    public Designer(String designerName, String designerImgPath, String designerIntroduction, String designerStyle, String fields, Integer fields1) {
        this.designerName = designerName;
        this.designerImgPath = designerImgPath;
        this.designerIntroduction = designerIntroduction;
        this.designerStyle = designerStyle;
        this.fields = fields;
        this.fields1 = fields1;
    }

    public Integer getDesignerId() {
        return designerId;
    }

    public void setDesignerId(Integer designerId) {
        this.designerId = designerId;
    }

    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName;
    }

    public String getDesignerImgPath() {
        return designerImgPath;
    }

    public void setDesignerImgPath(String designerImgPath) {
        this.designerImgPath = designerImgPath;
    }

    public String getDesignerIntroduction() {
        return designerIntroduction;
    }

    public void setDesignerIntroduction(String designerIntroduction) {
        this.designerIntroduction = designerIntroduction;
    }

    public String getDesignerStyle() {
        return designerStyle;
    }

    public void setDesignerStyle(String designerStyle) {
        this.designerStyle = designerStyle;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public Integer getFields1() {
        return fields1;
    }

    public void setFields1(Integer fields1) {
        this.fields1 = fields1;
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
        Designer other = (Designer) that;
        return (this.getDesignerId() == null ? other.getDesignerId() == null : this.getDesignerId().equals(other.getDesignerId()))
            && (this.getDesignerName() == null ? other.getDesignerName() == null : this.getDesignerName().equals(other.getDesignerName()))
            && (this.getDesignerImgPath() == null ? other.getDesignerImgPath() == null : this.getDesignerImgPath().equals(other.getDesignerImgPath()))
            && (this.getDesignerIntroduction() == null ? other.getDesignerIntroduction() == null : this.getDesignerIntroduction().equals(other.getDesignerIntroduction()))
            && (this.getDesignerStyle() == null ? other.getDesignerStyle() == null : this.getDesignerStyle().equals(other.getDesignerStyle()))
            && (this.getFields() == null ? other.getFields() == null : this.getFields().equals(other.getFields()))
            && (this.getFields1() == null ? other.getFields1() == null : this.getFields1().equals(other.getFields1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDesignerId() == null) ? 0 : getDesignerId().hashCode());
        result = prime * result + ((getDesignerName() == null) ? 0 : getDesignerName().hashCode());
        result = prime * result + ((getDesignerImgPath() == null) ? 0 : getDesignerImgPath().hashCode());
        result = prime * result + ((getDesignerIntroduction() == null) ? 0 : getDesignerIntroduction().hashCode());
        result = prime * result + ((getDesignerStyle() == null) ? 0 : getDesignerStyle().hashCode());
        result = prime * result + ((getFields() == null) ? 0 : getFields().hashCode());
        result = prime * result + ((getFields1() == null) ? 0 : getFields1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", designerId=").append(designerId);
        sb.append(", designerName=").append(designerName);
        sb.append(", designerImgPath=").append(designerImgPath);
        sb.append(", designerIntroduction=").append(designerIntroduction);
        sb.append(", designerStyle=").append(designerStyle);
        sb.append(", fields=").append(fields);
        sb.append(", fields1=").append(fields1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}