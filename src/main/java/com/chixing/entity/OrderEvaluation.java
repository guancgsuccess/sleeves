package com.chixing.entity;

import java.io.Serializable;

/**
 * order_evaluation
 * @author 
 */
public class OrderEvaluation implements Serializable {
    /**
     * 评价id
     */
    private Integer orderEvaluationId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 评价分数
     */
    private Double orderEvaluationFraction;

    /**
     * 评价内容
     */
    private String orderEvaluationContent;

    /**
     * 冗余字段1
     */
    private String field1;

    /**
     * 冗余字段2
     */
    private Integer field2;

    private static final long serialVersionUID = 1L;

    public OrderEvaluation() {
    }

    public OrderEvaluation(Integer orderEvaluationId, Integer orderId, Double orderEvaluationFraction, String orderEvaluationContent, String field1, Integer field2) {
        this.orderEvaluationId = orderEvaluationId;
        this.orderId = orderId;
        this.orderEvaluationFraction = orderEvaluationFraction;
        this.orderEvaluationContent = orderEvaluationContent;
        this.field1 = field1;
        this.field2 = field2;
    }

    public OrderEvaluation(Integer orderId, Double orderEvaluationFraction, String orderEvaluationContent, String field1, Integer field2) {
        this.orderId = orderId;
        this.orderEvaluationFraction = orderEvaluationFraction;
        this.orderEvaluationContent = orderEvaluationContent;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Integer getOrderEvaluationId() {
        return orderEvaluationId;
    }

    public void setOrderEvaluationId(Integer orderEvaluationId) {
        this.orderEvaluationId = orderEvaluationId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getOrderEvaluationFraction() {
        return orderEvaluationFraction;
    }

    public void setOrderEvaluationFraction(Double orderEvaluationFraction) {
        this.orderEvaluationFraction = orderEvaluationFraction;
    }

    public String getOrderEvaluationContent() {
        return orderEvaluationContent;
    }

    public void setOrderEvaluationContent(String orderEvaluationContent) {
        this.orderEvaluationContent = orderEvaluationContent;
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
        OrderEvaluation other = (OrderEvaluation) that;
        return (this.getOrderEvaluationId() == null ? other.getOrderEvaluationId() == null : this.getOrderEvaluationId().equals(other.getOrderEvaluationId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderEvaluationFraction() == null ? other.getOrderEvaluationFraction() == null : this.getOrderEvaluationFraction().equals(other.getOrderEvaluationFraction()))
            && (this.getOrderEvaluationContent() == null ? other.getOrderEvaluationContent() == null : this.getOrderEvaluationContent().equals(other.getOrderEvaluationContent()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderEvaluationId() == null) ? 0 : getOrderEvaluationId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderEvaluationFraction() == null) ? 0 : getOrderEvaluationFraction().hashCode());
        result = prime * result + ((getOrderEvaluationContent() == null) ? 0 : getOrderEvaluationContent().hashCode());
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
        sb.append(", orderEvaluationId=").append(orderEvaluationId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderEvaluationFraction=").append(orderEvaluationFraction);
        sb.append(", orderEvaluationContent=").append(orderEvaluationContent);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}