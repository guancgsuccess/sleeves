package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * design_collection
 * @author 
 */
public class DesignCollection implements Serializable {
    /**
     * 方案收藏id
     */
    private Integer designCollectionId;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 方案id
     */
    private Integer designId;

    /**
     * 方案收藏时间
     */
    private Date designCollectionTime;

    /**
     * 方案收藏状态
     */
    private Integer designCollectionStatus;

    private String fields1;

    private String fields2;

    private static final long serialVersionUID = 1L;

    public Integer getDesignCollectionId() {
        return designCollectionId;
    }

    public void setDesignCollectionId(Integer designCollectionId) {
        this.designCollectionId = designCollectionId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getDesignId() {
        return designId;
    }

    public void setDesignId(Integer designId) {
        this.designId = designId;
    }

    public Date getDesignCollectionTime() {
        return designCollectionTime;
    }

    public void setDesignCollectionTime(Date designCollectionTime) {
        this.designCollectionTime = designCollectionTime;
    }

    public Integer getDesignCollectionStatus() {
        return designCollectionStatus;
    }

    public void setDesignCollectionStatus(Integer designCollectionStatus) {
        this.designCollectionStatus = designCollectionStatus;
    }

    public String getFields1() {
        return fields1;
    }

    public void setFields1(String fields1) {
        this.fields1 = fields1;
    }

    public String getFields2() {
        return fields2;
    }

    public void setFields2(String fields2) {
        this.fields2 = fields2;
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
        DesignCollection other = (DesignCollection) that;
        return (this.getDesignCollectionId() == null ? other.getDesignCollectionId() == null : this.getDesignCollectionId().equals(other.getDesignCollectionId()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getDesignId() == null ? other.getDesignId() == null : this.getDesignId().equals(other.getDesignId()))
            && (this.getDesignCollectionTime() == null ? other.getDesignCollectionTime() == null : this.getDesignCollectionTime().equals(other.getDesignCollectionTime()))
            && (this.getDesignCollectionStatus() == null ? other.getDesignCollectionStatus() == null : this.getDesignCollectionStatus().equals(other.getDesignCollectionStatus()))
            && (this.getFields1() == null ? other.getFields1() == null : this.getFields1().equals(other.getFields1()))
            && (this.getFields2() == null ? other.getFields2() == null : this.getFields2().equals(other.getFields2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDesignCollectionId() == null) ? 0 : getDesignCollectionId().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getDesignId() == null) ? 0 : getDesignId().hashCode());
        result = prime * result + ((getDesignCollectionTime() == null) ? 0 : getDesignCollectionTime().hashCode());
        result = prime * result + ((getDesignCollectionStatus() == null) ? 0 : getDesignCollectionStatus().hashCode());
        result = prime * result + ((getFields1() == null) ? 0 : getFields1().hashCode());
        result = prime * result + ((getFields2() == null) ? 0 : getFields2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", designCollectionId=").append(designCollectionId);
        sb.append(", clientId=").append(clientId);
        sb.append(", designId=").append(designId);
        sb.append(", designCollectionTime=").append(designCollectionTime);
        sb.append(", designCollectionStatus=").append(designCollectionStatus);
        sb.append(", fields1=").append(fields1);
        sb.append(", fields2=").append(fields2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}