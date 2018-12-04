package com.chixing.entity;

import java.io.Serializable;

/**
 * collection
 * @author 
 */
public class CollectionKey implements Serializable {
    /**
     * 客户ID
     */
    private Integer collectionClientId;

    /**
     * 设计方案ID
     */
    private Integer collectionDesignId;

    private static final long serialVersionUID = 1L;

    public CollectionKey() {
    }

    public CollectionKey(Integer collectionClientId, Integer collectionDesignId) {
        this.collectionClientId = collectionClientId;
        this.collectionDesignId = collectionDesignId;
    }

    public Integer getCollectionClientId() {
        return collectionClientId;
    }

    public void setCollectionClientId(Integer collectionClientId) {
        this.collectionClientId = collectionClientId;
    }

    public Integer getCollectionDesignId() {
        return collectionDesignId;
    }

    public void setCollectionDesignId(Integer collectionDesignId) {
        this.collectionDesignId = collectionDesignId;
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
        CollectionKey other = (CollectionKey) that;
        return (this.getCollectionClientId() == null ? other.getCollectionClientId() == null : this.getCollectionClientId().equals(other.getCollectionClientId()))
            && (this.getCollectionDesignId() == null ? other.getCollectionDesignId() == null : this.getCollectionDesignId().equals(other.getCollectionDesignId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollectionClientId() == null) ? 0 : getCollectionClientId().hashCode());
        result = prime * result + ((getCollectionDesignId() == null) ? 0 : getCollectionDesignId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectionClientId=").append(collectionClientId);
        sb.append(", collectionDesignId=").append(collectionDesignId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}