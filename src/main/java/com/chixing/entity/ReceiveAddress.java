package com.chixing.entity;

import java.io.Serializable;

/**
 * receive_address
 * @author 
 */
public class ReceiveAddress implements Serializable {
    /**
     * 地区ID
     */
    private Integer addressId;

    /**
     * 地区名称
     */
    private String addressName;

    /**
     * 详细地址
     */
    private String addressDetail;

    /**
     * 收货人真实姓名
     */
    private String clientName;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 1:为默认地址,
     */
    private Integer defaultAddress;

    /**
     * 地址状态
     */
    private Integer fields1;

    /**
     * 冗余字段2
     */
    private String fields2;

    /**
     * 收货人电话
     */
    private String clientTelephone;

    private static final long serialVersionUID = 1L;

    public ReceiveAddress() {
    }

    public ReceiveAddress(String addressName, String addressDetail, String clientName, Integer clientId, Integer defaultAddress, Integer fields1, String fields2, String clientTelephone) {
        this.addressName = addressName;
        this.addressDetail = addressDetail;
        this.clientName = clientName;
        this.clientId = clientId;
        this.defaultAddress = defaultAddress;
        this.fields1 = fields1;
        this.fields2 = fields2;
        this.clientTelephone = clientTelephone;
    }

    public ReceiveAddress(Integer addressId, String addressName, String addressDetail, String clientName, Integer clientId, Integer defaultAddress, Integer fields1, String fields2, String clientTelephone) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.addressDetail = addressDetail;
        this.clientName = clientName;
        this.clientId = clientId;
        this.defaultAddress = defaultAddress;
        this.fields1 = fields1;
        this.fields2 = fields2;
        this.clientTelephone = clientTelephone;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(Integer defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public Integer getFields1() {
        return fields1;
    }

    public void setFields1(Integer fields1) {
        this.fields1 = fields1;
    }

    public String getFields2() {
        return fields2;
    }

    public void setFields2(String fields2) {
        this.fields2 = fields2;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
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
        ReceiveAddress other = (ReceiveAddress) that;
        return (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getAddressName() == null ? other.getAddressName() == null : this.getAddressName().equals(other.getAddressName()))
            && (this.getAddressDetail() == null ? other.getAddressDetail() == null : this.getAddressDetail().equals(other.getAddressDetail()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getDefaultAddress() == null ? other.getDefaultAddress() == null : this.getDefaultAddress().equals(other.getDefaultAddress()))
            && (this.getFields1() == null ? other.getFields1() == null : this.getFields1().equals(other.getFields1()))
            && (this.getFields2() == null ? other.getFields2() == null : this.getFields2().equals(other.getFields2()))
            && (this.getClientTelephone() == null ? other.getClientTelephone() == null : this.getClientTelephone().equals(other.getClientTelephone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getAddressName() == null) ? 0 : getAddressName().hashCode());
        result = prime * result + ((getAddressDetail() == null) ? 0 : getAddressDetail().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getDefaultAddress() == null) ? 0 : getDefaultAddress().hashCode());
        result = prime * result + ((getFields1() == null) ? 0 : getFields1().hashCode());
        result = prime * result + ((getFields2() == null) ? 0 : getFields2().hashCode());
        result = prime * result + ((getClientTelephone() == null) ? 0 : getClientTelephone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", addressName=").append(addressName);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", clientName=").append(clientName);
        sb.append(", clientId=").append(clientId);
        sb.append(", defaultAddress=").append(defaultAddress);
        sb.append(", fields1=").append(fields1);
        sb.append(", fields2=").append(fields2);
        sb.append(", clientTelephone=").append(clientTelephone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}