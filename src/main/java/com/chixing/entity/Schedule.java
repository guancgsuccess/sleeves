package com.chixing.entity;

import java.io.Serializable;

/**
 * schedule
 * @author 
 */
public class Schedule implements Serializable {
    /**
     * 进度id
     */
    private Integer scheduleId;

    /**
     * 订单id
     */
    private Integer scheduleOrderId;

    /**
     * 进度状态
     */
    private Integer scheduleStatus;

    /**
     * 冗余字段1
     */
    private String field1;

    /**
     * 冗余字段2
     */
    private Integer field2;

    private static final long serialVersionUID = 1L;

    public Schedule() {
    }

    public Schedule(Integer scheduleId, Integer scheduleOrderId, Integer scheduleStatus, String field1, Integer field2) {
        this.scheduleId = scheduleId;
        this.scheduleOrderId = scheduleOrderId;
        this.scheduleStatus = scheduleStatus;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Schedule(Integer scheduleOrderId, Integer scheduleStatus, String field1, Integer field2) {
        this.scheduleOrderId = scheduleOrderId;
        this.scheduleStatus = scheduleStatus;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getScheduleOrderId() {
        return scheduleOrderId;
    }

    public void setScheduleOrderId(Integer scheduleOrderId) {
        this.scheduleOrderId = scheduleOrderId;
    }

    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
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
        Schedule other = (Schedule) that;
        return (this.getScheduleId() == null ? other.getScheduleId() == null : this.getScheduleId().equals(other.getScheduleId()))
            && (this.getScheduleOrderId() == null ? other.getScheduleOrderId() == null : this.getScheduleOrderId().equals(other.getScheduleOrderId()))
            && (this.getScheduleStatus() == null ? other.getScheduleStatus() == null : this.getScheduleStatus().equals(other.getScheduleStatus()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScheduleId() == null) ? 0 : getScheduleId().hashCode());
        result = prime * result + ((getScheduleOrderId() == null) ? 0 : getScheduleOrderId().hashCode());
        result = prime * result + ((getScheduleStatus() == null) ? 0 : getScheduleStatus().hashCode());
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
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", scheduleOrderId=").append(scheduleOrderId);
        sb.append(", scheduleStatus=").append(scheduleStatus);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}