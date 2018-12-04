package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * company_collection
 * @author 
 */
public class CompanyCollection implements Serializable {
    /**
     * 公司收藏id
     */
    private Integer companyCollectionId;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 公司id
     */
    private Integer companyId;

    /**
     * 公司收藏时间
     */
    private Date companyCollectinTime;

    /**
     * 冗余字段1
     */
    private String companyField1;

    /**
     * 冗余字段2
     */
    private String companyField2;

    /**
     * 公司收藏状态
     */
    private Integer companyCollectionStatus;

    private static final long serialVersionUID = 1L;

    public CompanyCollection() {
    }

    public CompanyCollection(Integer clientId, Integer companyId, Date companyCollectinTime, String companyField1, String companyField2, Integer companyCollectionStatus) {
        this.clientId = clientId;
        this.companyId = companyId;
        this.companyCollectinTime = companyCollectinTime;
        this.companyField1 = companyField1;
        this.companyField2 = companyField2;
        this.companyCollectionStatus = companyCollectionStatus;
    }

    public CompanyCollection(Integer companyCollectionId, Integer clientId, Integer companyId, Date companyCollectinTime, String companyField1, String companyField2, Integer companyCollectionStatus) {
        this.companyCollectionId = companyCollectionId;
        this.clientId = clientId;
        this.companyId = companyId;
        this.companyCollectinTime = companyCollectinTime;
        this.companyField1 = companyField1;
        this.companyField2 = companyField2;
        this.companyCollectionStatus = companyCollectionStatus;
    }

    public Integer getCompanyCollectionId() {
        return companyCollectionId;
    }

    public void setCompanyCollectionId(Integer companyCollectionId) {
        this.companyCollectionId = companyCollectionId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getCompanyCollectinTime() {
        return companyCollectinTime;
    }

    public void setCompanyCollectinTime(Date companyCollectinTime) {
        this.companyCollectinTime = companyCollectinTime;
    }

    public String getCompanyField1() {
        return companyField1;
    }

    public void setCompanyField1(String companyField1) {
        this.companyField1 = companyField1;
    }

    public String getCompanyField2() {
        return companyField2;
    }

    public void setCompanyField2(String companyField2) {
        this.companyField2 = companyField2;
    }

    public Integer getCompanyCollectionStatus() {
        return companyCollectionStatus;
    }

    public void setCompanyCollectionStatus(Integer companyCollectionStatus) {
        this.companyCollectionStatus = companyCollectionStatus;
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
        CompanyCollection other = (CompanyCollection) that;
        return (this.getCompanyCollectionId() == null ? other.getCompanyCollectionId() == null : this.getCompanyCollectionId().equals(other.getCompanyCollectionId()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCompanyCollectinTime() == null ? other.getCompanyCollectinTime() == null : this.getCompanyCollectinTime().equals(other.getCompanyCollectinTime()))
            && (this.getCompanyField1() == null ? other.getCompanyField1() == null : this.getCompanyField1().equals(other.getCompanyField1()))
            && (this.getCompanyField2() == null ? other.getCompanyField2() == null : this.getCompanyField2().equals(other.getCompanyField2()))
            && (this.getCompanyCollectionStatus() == null ? other.getCompanyCollectionStatus() == null : this.getCompanyCollectionStatus().equals(other.getCompanyCollectionStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyCollectionId() == null) ? 0 : getCompanyCollectionId().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCompanyCollectinTime() == null) ? 0 : getCompanyCollectinTime().hashCode());
        result = prime * result + ((getCompanyField1() == null) ? 0 : getCompanyField1().hashCode());
        result = prime * result + ((getCompanyField2() == null) ? 0 : getCompanyField2().hashCode());
        result = prime * result + ((getCompanyCollectionStatus() == null) ? 0 : getCompanyCollectionStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyCollectionId=").append(companyCollectionId);
        sb.append(", clientId=").append(clientId);
        sb.append(", companyId=").append(companyId);
        sb.append(", companyCollectinTime=").append(companyCollectinTime);
        sb.append(", companyField1=").append(companyField1);
        sb.append(", companyField2=").append(companyField2);
        sb.append(", companyCollectionStatus=").append(companyCollectionStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}