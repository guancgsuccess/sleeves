package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * rendering_collection
 * @author 
 */
public class RenderingCollection implements Serializable {
    /**
     * 效果图收藏id
     */
    private Integer renderingCollectionId;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 效果图id
     */
    private Integer renderingId;

    /**
     * 效果图收藏时间
     */
    private Date renderingCollectionTime;

    /**
     * 效果图收藏状态
     */
    private Integer renderingCollectionStatus;

    private String firlds1;

    private String firlds2;

    private static final long serialVersionUID = 1L;

    public Integer getRenderingCollectionId() {
        return renderingCollectionId;
    }

    public void setRenderingCollectionId(Integer renderingCollectionId) {
        this.renderingCollectionId = renderingCollectionId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getRenderingId() {
        return renderingId;
    }

    public void setRenderingId(Integer renderingId) {
        this.renderingId = renderingId;
    }

    public Date getRenderingCollectionTime() {
        return renderingCollectionTime;
    }

    public void setRenderingCollectionTime(Date renderingCollectionTime) {
        this.renderingCollectionTime = renderingCollectionTime;
    }

    public Integer getRenderingCollectionStatus() {
        return renderingCollectionStatus;
    }

    public void setRenderingCollectionStatus(Integer renderingCollectionStatus) {
        this.renderingCollectionStatus = renderingCollectionStatus;
    }

    public String getFirlds1() {
        return firlds1;
    }

    public void setFirlds1(String firlds1) {
        this.firlds1 = firlds1;
    }

    public String getFirlds2() {
        return firlds2;
    }

    public void setFirlds2(String firlds2) {
        this.firlds2 = firlds2;
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
        RenderingCollection other = (RenderingCollection) that;
        return (this.getRenderingCollectionId() == null ? other.getRenderingCollectionId() == null : this.getRenderingCollectionId().equals(other.getRenderingCollectionId()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getRenderingId() == null ? other.getRenderingId() == null : this.getRenderingId().equals(other.getRenderingId()))
            && (this.getRenderingCollectionTime() == null ? other.getRenderingCollectionTime() == null : this.getRenderingCollectionTime().equals(other.getRenderingCollectionTime()))
            && (this.getRenderingCollectionStatus() == null ? other.getRenderingCollectionStatus() == null : this.getRenderingCollectionStatus().equals(other.getRenderingCollectionStatus()))
            && (this.getFirlds1() == null ? other.getFirlds1() == null : this.getFirlds1().equals(other.getFirlds1()))
            && (this.getFirlds2() == null ? other.getFirlds2() == null : this.getFirlds2().equals(other.getFirlds2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRenderingCollectionId() == null) ? 0 : getRenderingCollectionId().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getRenderingId() == null) ? 0 : getRenderingId().hashCode());
        result = prime * result + ((getRenderingCollectionTime() == null) ? 0 : getRenderingCollectionTime().hashCode());
        result = prime * result + ((getRenderingCollectionStatus() == null) ? 0 : getRenderingCollectionStatus().hashCode());
        result = prime * result + ((getFirlds1() == null) ? 0 : getFirlds1().hashCode());
        result = prime * result + ((getFirlds2() == null) ? 0 : getFirlds2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", renderingCollectionId=").append(renderingCollectionId);
        sb.append(", clientId=").append(clientId);
        sb.append(", renderingId=").append(renderingId);
        sb.append(", renderingCollectionTime=").append(renderingCollectionTime);
        sb.append(", renderingCollectionStatus=").append(renderingCollectionStatus);
        sb.append(", firlds1=").append(firlds1);
        sb.append(", firlds2=").append(firlds2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}