package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * login_status
 * @author 
 */
public class LoginStatus implements Serializable {
    /**
     * 登录状态id
     */
    private Integer loginStatusId;

    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 客户ip
     */
    private String clientIp;

    /**
     * 客户登录状态
     */
    private Integer clientLoginStatus;

    /**
     * 客户登录时间

     */
    private Date clientLoginTime;

    /**
     * 客户登录方式
     */
    private String clientLoginMethod;

    /**
     * 冗余字段1

     */
    private Integer field;

    /**
     * 冗余字段2
     */
    private String field1;

    private static final long serialVersionUID = 1L;

    public LoginStatus() {
    }

    public LoginStatus(Integer loginStatusId, Integer clientId, String clientIp, Integer clientLoginStatus, Date clientLoginTime, String clientLoginMethod, Integer field, String field1) {
        this.loginStatusId = loginStatusId;
        this.clientId = clientId;
        this.clientIp = clientIp;
        this.clientLoginStatus = clientLoginStatus;
        this.clientLoginTime = clientLoginTime;
        this.clientLoginMethod = clientLoginMethod;
        this.field = field;
        this.field1 = field1;
    }

    public LoginStatus(Integer clientId, String clientIp, Integer clientLoginStatus, Date clientLoginTime, String clientLoginMethod, Integer field, String field1) {
        this.clientId = clientId;
        this.clientIp = clientIp;
        this.clientLoginStatus = clientLoginStatus;
        this.clientLoginTime = clientLoginTime;
        this.clientLoginMethod = clientLoginMethod;
        this.field = field;
        this.field1 = field1;
    }

    public Integer getLoginStatusId() {
        return loginStatusId;
    }

    public void setLoginStatusId(Integer loginStatusId) {
        this.loginStatusId = loginStatusId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Integer getClientLoginStatus() {
        return clientLoginStatus;
    }

    public void setClientLoginStatus(Integer clientLoginStatus) {
        this.clientLoginStatus = clientLoginStatus;
    }

    public Date getClientLoginTime() {
        return clientLoginTime;
    }

    public void setClientLoginTime(Date clientLoginTime) {
        this.clientLoginTime = clientLoginTime;
    }

    public String getClientLoginMethod() {
        return clientLoginMethod;
    }

    public void setClientLoginMethod(String clientLoginMethod) {
        this.clientLoginMethod = clientLoginMethod;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
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
        LoginStatus other = (LoginStatus) that;
        return (this.getLoginStatusId() == null ? other.getLoginStatusId() == null : this.getLoginStatusId().equals(other.getLoginStatusId()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getClientIp() == null ? other.getClientIp() == null : this.getClientIp().equals(other.getClientIp()))
            && (this.getClientLoginStatus() == null ? other.getClientLoginStatus() == null : this.getClientLoginStatus().equals(other.getClientLoginStatus()))
            && (this.getClientLoginTime() == null ? other.getClientLoginTime() == null : this.getClientLoginTime().equals(other.getClientLoginTime()))
            && (this.getClientLoginMethod() == null ? other.getClientLoginMethod() == null : this.getClientLoginMethod().equals(other.getClientLoginMethod()))
            && (this.getField() == null ? other.getField() == null : this.getField().equals(other.getField()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoginStatusId() == null) ? 0 : getLoginStatusId().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getClientIp() == null) ? 0 : getClientIp().hashCode());
        result = prime * result + ((getClientLoginStatus() == null) ? 0 : getClientLoginStatus().hashCode());
        result = prime * result + ((getClientLoginTime() == null) ? 0 : getClientLoginTime().hashCode());
        result = prime * result + ((getClientLoginMethod() == null) ? 0 : getClientLoginMethod().hashCode());
        result = prime * result + ((getField() == null) ? 0 : getField().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginStatusId=").append(loginStatusId);
        sb.append(", clientId=").append(clientId);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", clientLoginStatus=").append(clientLoginStatus);
        sb.append(", clientLoginTime=").append(clientLoginTime);
        sb.append(", clientLoginMethod=").append(clientLoginMethod);
        sb.append(", field=").append(field);
        sb.append(", field1=").append(field1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}