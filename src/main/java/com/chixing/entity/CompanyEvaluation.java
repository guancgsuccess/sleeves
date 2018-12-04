package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * company_evaluation
 * @author 
 */
public class CompanyEvaluation implements Serializable {
    /**
     * 公司评价id
     */
    private Integer evaluationId;

    /**
     * 订单id
     */
    private Integer evaluationOrderId;

    /**
     * 公司id
     */
    private Integer evaluationCompanyId;

    /**
     * 评论时间
     */
    private Date evaluationTime;

    /**
     * 评价内容
     */
    private String evaluationContent;

    /**
     * 公司评价分数
     */
    private Double evaluationCompanyFraction;

    /**
     * 评论内容
     */
    private String field1;

    /**
     * 冗余字段2
     */
    private Integer field2;

    private static final long serialVersionUID = 1L;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getEvaluationOrderId() {
        return evaluationOrderId;
    }

    public void setEvaluationOrderId(Integer evaluationOrderId) {
        this.evaluationOrderId = evaluationOrderId;
    }

    public Integer getEvaluationCompanyId() {
        return evaluationCompanyId;
    }

    public void setEvaluationCompanyId(Integer evaluationCompanyId) {
        this.evaluationCompanyId = evaluationCompanyId;
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }

    public Double getEvaluationCompanyFraction() {
        return evaluationCompanyFraction;
    }

    public void setEvaluationCompanyFraction(Double evaluationCompanyFraction) {
        this.evaluationCompanyFraction = evaluationCompanyFraction;
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
        CompanyEvaluation other = (CompanyEvaluation) that;
        return (this.getEvaluationId() == null ? other.getEvaluationId() == null : this.getEvaluationId().equals(other.getEvaluationId()))
            && (this.getEvaluationOrderId() == null ? other.getEvaluationOrderId() == null : this.getEvaluationOrderId().equals(other.getEvaluationOrderId()))
            && (this.getEvaluationCompanyId() == null ? other.getEvaluationCompanyId() == null : this.getEvaluationCompanyId().equals(other.getEvaluationCompanyId()))
            && (this.getEvaluationTime() == null ? other.getEvaluationTime() == null : this.getEvaluationTime().equals(other.getEvaluationTime()))
            && (this.getEvaluationContent() == null ? other.getEvaluationContent() == null : this.getEvaluationContent().equals(other.getEvaluationContent()))
            && (this.getEvaluationCompanyFraction() == null ? other.getEvaluationCompanyFraction() == null : this.getEvaluationCompanyFraction().equals(other.getEvaluationCompanyFraction()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        result = prime * result + ((getEvaluationOrderId() == null) ? 0 : getEvaluationOrderId().hashCode());
        result = prime * result + ((getEvaluationCompanyId() == null) ? 0 : getEvaluationCompanyId().hashCode());
        result = prime * result + ((getEvaluationTime() == null) ? 0 : getEvaluationTime().hashCode());
        result = prime * result + ((getEvaluationContent() == null) ? 0 : getEvaluationContent().hashCode());
        result = prime * result + ((getEvaluationCompanyFraction() == null) ? 0 : getEvaluationCompanyFraction().hashCode());
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
        sb.append(", evaluationId=").append(evaluationId);
        sb.append(", evaluationOrderId=").append(evaluationOrderId);
        sb.append(", evaluationCompanyId=").append(evaluationCompanyId);
        sb.append(", evaluationTime=").append(evaluationTime);
        sb.append(", evaluationContent=").append(evaluationContent);
        sb.append(", evaluationCompanyFraction=").append(evaluationCompanyFraction);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}