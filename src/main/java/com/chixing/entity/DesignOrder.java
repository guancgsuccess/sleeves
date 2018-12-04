package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * design_order : 方案订单实体类
 * @author 
 */
public class DesignOrder implements Serializable {
    /**
     * 方案订单id
     */
    private Integer designOrderId;

    /**
     * 方案订单编号
     */
    private String designOrderNo;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 方案id
     */
    private Integer designId;

    /**
     * 下订单时间
     */
    private Date designOrderTime;

    /**
     * 订单金额
     */
    private Integer designOrderStatus;

    /**
     * 订单冗余字段1
     */
    private String orderFields1;

    /**
     * 订单冗余字段2
     */
    private String orderFields2;

    private static final long serialVersionUID = 1L;

    public DesignOrder() {
    }

    public DesignOrder(Integer designOrderId, String designOrderNo, Integer clientId, Integer designId, Date designOrderTime, Integer designOrderStatus, String orderFields1, String orderFields2) {
        this.designOrderId = designOrderId;
        this.designOrderNo = designOrderNo;
        this.clientId = clientId;
        this.designId = designId;
        this.designOrderTime = designOrderTime;
        this.designOrderStatus = designOrderStatus;
        this.orderFields1 = orderFields1;
        this.orderFields2 = orderFields2;
    }

    public DesignOrder(String designOrderNo, Integer clientId, Integer designId, Date designOrderTime, Integer designOrderStatus, String orderFields1, String orderFields2) {
        this.designOrderNo = designOrderNo;
        this.clientId = clientId;
        this.designId = designId;
        this.designOrderTime = designOrderTime;
        this.designOrderStatus = designOrderStatus;
        this.orderFields1 = orderFields1;
        this.orderFields2 = orderFields2;
    }

    public Integer getDesignOrderId() {
        return designOrderId;
    }

    public void setDesignOrderId(Integer designOrderId) {
        this.designOrderId = designOrderId;
    }

    public String getDesignOrderNo() {
        return designOrderNo;
    }

    public void setDesignOrderNo(String designOrderNo) {
        this.designOrderNo = designOrderNo;
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

    public Date getDesignOrderTime() {
        return designOrderTime;
    }

    public void setDesignOrderTime(Date designOrderTime) {
        this.designOrderTime = designOrderTime;
    }

    public Integer getDesignOrderStatus() {
        return designOrderStatus;
    }

    public void setDesignOrderStatus(Integer designOrderStatus) {
        this.designOrderStatus = designOrderStatus;
    }

    public String getOrderFields1() {
        return orderFields1;
    }

    public void setOrderFields1(String orderFields1) {
        this.orderFields1 = orderFields1;
    }

    public String getOrderFields2() {
        return orderFields2;
    }

    public void setOrderFields2(String orderFields2) {
        this.orderFields2 = orderFields2;
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
        DesignOrder other = (DesignOrder) that;
        return (this.getDesignOrderId() == null ? other.getDesignOrderId() == null : this.getDesignOrderId().equals(other.getDesignOrderId()))
            && (this.getDesignOrderNo() == null ? other.getDesignOrderNo() == null : this.getDesignOrderNo().equals(other.getDesignOrderNo()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getDesignId() == null ? other.getDesignId() == null : this.getDesignId().equals(other.getDesignId()))
            && (this.getDesignOrderTime() == null ? other.getDesignOrderTime() == null : this.getDesignOrderTime().equals(other.getDesignOrderTime()))
            && (this.getDesignOrderStatus() == null ? other.getDesignOrderStatus() == null : this.getDesignOrderStatus().equals(other.getDesignOrderStatus()))
            && (this.getOrderFields1() == null ? other.getOrderFields1() == null : this.getOrderFields1().equals(other.getOrderFields1()))
            && (this.getOrderFields2() == null ? other.getOrderFields2() == null : this.getOrderFields2().equals(other.getOrderFields2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDesignOrderId() == null) ? 0 : getDesignOrderId().hashCode());
        result = prime * result + ((getDesignOrderNo() == null) ? 0 : getDesignOrderNo().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getDesignId() == null) ? 0 : getDesignId().hashCode());
        result = prime * result + ((getDesignOrderTime() == null) ? 0 : getDesignOrderTime().hashCode());
        result = prime * result + ((getDesignOrderStatus() == null) ? 0 : getDesignOrderStatus().hashCode());
        result = prime * result + ((getOrderFields1() == null) ? 0 : getOrderFields1().hashCode());
        result = prime * result + ((getOrderFields2() == null) ? 0 : getOrderFields2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", designOrderId=").append(designOrderId);
        sb.append(", designOrderNo=").append(designOrderNo);
        sb.append(", clientId=").append(clientId);
        sb.append(", designId=").append(designId);
        sb.append(", designOrderTime=").append(designOrderTime);
        sb.append(", designOrderStatus=").append(designOrderStatus);
        sb.append(", orderFields1=").append(orderFields1);
        sb.append(", orderFields2=").append(orderFields2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}