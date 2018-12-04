package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * collection
 * @author 
 */
public class Collection extends CollectionKey implements Serializable {
    /**
     * 收藏ID
     */
    private Integer collectionId;

    /**
     * 收藏时间
     */
    private Date collectionTime;

    /**
     * 收藏状态
     */
    private Integer collectionStatus;

    /**
     * 冗余字段1
     */
    private String field1;

    /**
     * 冗余字段2
     */
    private Integer field2;

    private static final long serialVersionUID = 1L;

    public Collection() {
    }

    public Collection(Integer collectionId, Date collectionTime, Integer collectionStatus, String field1, Integer field2) {
        this.collectionId = collectionId;
        this.collectionTime = collectionTime;
        this.collectionStatus = collectionStatus;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Collection(Date collectionTime, Integer collectionStatus, String field1, Integer field2) {
        this.collectionTime = collectionTime;
        this.collectionStatus = collectionStatus;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    public Integer getCollectionStatus() {
        return collectionStatus;
    }

    public void setCollectionStatus(Integer collectionStatus) {
        this.collectionStatus = collectionStatus;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public Integer getField2() {
        return field2;
    }

    public void setField2(Integer field2) {
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
        Collection other = (Collection) that;
        return (this.getCollectionClientId() == null ? other.getCollectionClientId() == null : this.getCollectionClientId().equals(other.getCollectionClientId()))
            && (this.getCollectionDesignId() == null ? other.getCollectionDesignId() == null : this.getCollectionDesignId().equals(other.getCollectionDesignId()))
            && (this.getCollectionId() == null ? other.getCollectionId() == null : this.getCollectionId().equals(other.getCollectionId()))
            && (this.getCollectionTime() == null ? other.getCollectionTime() == null : this.getCollectionTime().equals(other.getCollectionTime()))
            && (this.getCollectionStatus() == null ? other.getCollectionStatus() == null : this.getCollectionStatus().equals(other.getCollectionStatus()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollectionClientId() == null) ? 0 : getCollectionClientId().hashCode());
        result = prime * result + ((getCollectionDesignId() == null) ? 0 : getCollectionDesignId().hashCode());
        result = prime * result + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        result = prime * result + ((getCollectionTime() == null) ? 0 : getCollectionTime().hashCode());
        result = prime * result + ((getCollectionStatus() == null) ? 0 : getCollectionStatus().hashCode());
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
        sb.append(", collectionId=").append(collectionId);
        sb.append(", collectionTime=").append(collectionTime);
        sb.append(", collectionStatus=").append(collectionStatus);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}