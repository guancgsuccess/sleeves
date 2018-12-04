package com.chixing.entity;

import java.io.Serializable;

/**
 * rendering_img
 * @author 
 */
public class RenderingImg implements Serializable {
    /**
     * 效果图图片id
     */
    private Integer renderingImgId;

    /**
     * 效果图id
     */
    private Integer renderingId;

    /**
     * 效果图图片路径
     */
    private String renderingImagesPath;

    /**
     * 效果图图片序号
     */
    private Integer renderingSortno;

    /**
     * 冗余字段1
     */
    private String fileds1;

    /**
     * 冗余字段2
     */
    private Integer fileds2;

    private static final long serialVersionUID = 1L;

    public Integer getRenderingImgId() {
        return renderingImgId;
    }

    public void setRenderingImgId(Integer renderingImgId) {
        this.renderingImgId = renderingImgId;
    }

    public Integer getRenderingId() {
        return renderingId;
    }

    public void setRenderingId(Integer renderingId) {
        this.renderingId = renderingId;
    }

    public String getRenderingImagesPath() {
        return renderingImagesPath;
    }

    public void setRenderingImagesPath(String renderingImagesPath) {
        this.renderingImagesPath = renderingImagesPath;
    }

    public Integer getRenderingSortno() {
        return renderingSortno;
    }

    public void setRenderingSortno(Integer renderingSortno) {
        this.renderingSortno = renderingSortno;
    }

    public String getFileds1() {
        return fileds1;
    }

    public void setFileds1(String fileds1) {
        this.fileds1 = fileds1;
    }

    public Integer getFileds2() {
        return fileds2;
    }

    public void setFileds2(Integer fileds2) {
        this.fileds2 = fileds2;
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
        RenderingImg other = (RenderingImg) that;
        return (this.getRenderingImgId() == null ? other.getRenderingImgId() == null : this.getRenderingImgId().equals(other.getRenderingImgId()))
            && (this.getRenderingId() == null ? other.getRenderingId() == null : this.getRenderingId().equals(other.getRenderingId()))
            && (this.getRenderingImagesPath() == null ? other.getRenderingImagesPath() == null : this.getRenderingImagesPath().equals(other.getRenderingImagesPath()))
            && (this.getRenderingSortno() == null ? other.getRenderingSortno() == null : this.getRenderingSortno().equals(other.getRenderingSortno()))
            && (this.getFileds1() == null ? other.getFileds1() == null : this.getFileds1().equals(other.getFileds1()))
            && (this.getFileds2() == null ? other.getFileds2() == null : this.getFileds2().equals(other.getFileds2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRenderingImgId() == null) ? 0 : getRenderingImgId().hashCode());
        result = prime * result + ((getRenderingId() == null) ? 0 : getRenderingId().hashCode());
        result = prime * result + ((getRenderingImagesPath() == null) ? 0 : getRenderingImagesPath().hashCode());
        result = prime * result + ((getRenderingSortno() == null) ? 0 : getRenderingSortno().hashCode());
        result = prime * result + ((getFileds1() == null) ? 0 : getFileds1().hashCode());
        result = prime * result + ((getFileds2() == null) ? 0 : getFileds2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", renderingImgId=").append(renderingImgId);
        sb.append(", renderingId=").append(renderingId);
        sb.append(", renderingImagesPath=").append(renderingImagesPath);
        sb.append(", renderingSortno=").append(renderingSortno);
        sb.append(", fileds1=").append(fileds1);
        sb.append(", fileds2=").append(fileds2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}