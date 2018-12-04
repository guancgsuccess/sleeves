package com.chixing.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * client
 * @author 
 */
public class Client implements Serializable {
    /**
     * 客户id
     */
    private Integer clientId;

    /**
     * 客户用户名
     */
    private String clientName;

    /**
     * 客户账户
     */
    private String clientAccount;

    /**
     * 用户密码
     */
    private String clientPassword;

    /**
     * 用户手机号
     */
    private Long clientTelephone;

    /**
     * 用户邮箱
     */
    private String clientEmail;

    /**
     * 用户头像
     */
    private String clientProfile;

    /**
     * 用户年龄
     */
    private Integer clientAge;

    /**
     * 用户生日
     */
    private Date clientBirthday;

    /**
     * 用户性别
     */
    private Integer clientGender;

    /**
     * 用户地址
     */
    private String clientAddress;

    /**
     * 用户状态
     */
    private Integer clientStatus;

    /**
     * 冗余字段1

     */
    private Integer clientField;

    /**
     * 冗余字段2
     */
    private String clientField1;

    private static final long serialVersionUID = 1L;

    public Client() {
    }

    public Client(Integer clientId, String clientName, String clientAccount, String clientPassword, Long clientTelephone, String clientEmail, String clientProfile, Integer clientAge, Date clientBirthday, Integer clientGender, String clientAddress, Integer clientStatus, Integer clientField, String clientField1) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientAccount = clientAccount;
        this.clientPassword = clientPassword;
        this.clientTelephone = clientTelephone;
        this.clientEmail = clientEmail;
        this.clientProfile = clientProfile;
        this.clientAge = clientAge;
        this.clientBirthday = clientBirthday;
        this.clientGender = clientGender;
        this.clientAddress = clientAddress;
        this.clientStatus = clientStatus;
        this.clientField = clientField;
        this.clientField1 = clientField1;
    }

    public Client(String clientName, String clientAccount, String clientPassword, Long clientTelephone, String clientEmail, String clientProfile, Integer clientAge, Date clientBirthday, Integer clientGender, String clientAddress, Integer clientStatus, Integer clientField, String clientField1) {
        this.clientName = clientName;
        this.clientAccount = clientAccount;
        this.clientPassword = clientPassword;
        this.clientTelephone = clientTelephone;
        this.clientEmail = clientEmail;
        this.clientProfile = clientProfile;
        this.clientAge = clientAge;
        this.clientBirthday = clientBirthday;
        this.clientGender = clientGender;
        this.clientAddress = clientAddress;
        this.clientStatus = clientStatus;
        this.clientField = clientField;
        this.clientField1 = clientField1;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public Long getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(Long clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientProfile() {
        return clientProfile;
    }

    public void setClientProfile(String clientProfile) {
        this.clientProfile = clientProfile;
    }

    public Integer getClientAge() {
        return clientAge;
    }

    public void setClientAge(Integer clientAge) {
        this.clientAge = clientAge;
    }

    public Date getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(Date clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    public Integer getClientGender() {
        return clientGender;
    }

    public void setClientGender(Integer clientGender) {
        this.clientGender = clientGender;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Integer getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(Integer clientStatus) {
        this.clientStatus = clientStatus;
    }

    public Integer getClientField() {
        return clientField;
    }

    public void setClientField(Integer clientField) {
        this.clientField = clientField;
    }

    public String getClientField1() {
        return clientField1;
    }

    public void setClientField1(String clientField1) {
        this.clientField1 = clientField1;
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
        Client other = (Client) that;
        return (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getClientAccount() == null ? other.getClientAccount() == null : this.getClientAccount().equals(other.getClientAccount()))
            && (this.getClientPassword() == null ? other.getClientPassword() == null : this.getClientPassword().equals(other.getClientPassword()))
            && (this.getClientTelephone() == null ? other.getClientTelephone() == null : this.getClientTelephone().equals(other.getClientTelephone()))
            && (this.getClientEmail() == null ? other.getClientEmail() == null : this.getClientEmail().equals(other.getClientEmail()))
            && (this.getClientProfile() == null ? other.getClientProfile() == null : this.getClientProfile().equals(other.getClientProfile()))
            && (this.getClientAge() == null ? other.getClientAge() == null : this.getClientAge().equals(other.getClientAge()))
            && (this.getClientBirthday() == null ? other.getClientBirthday() == null : this.getClientBirthday().equals(other.getClientBirthday()))
            && (this.getClientGender() == null ? other.getClientGender() == null : this.getClientGender().equals(other.getClientGender()))
            && (this.getClientAddress() == null ? other.getClientAddress() == null : this.getClientAddress().equals(other.getClientAddress()))
            && (this.getClientStatus() == null ? other.getClientStatus() == null : this.getClientStatus().equals(other.getClientStatus()))
            && (this.getClientField() == null ? other.getClientField() == null : this.getClientField().equals(other.getClientField()))
            && (this.getClientField1() == null ? other.getClientField1() == null : this.getClientField1().equals(other.getClientField1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getClientAccount() == null) ? 0 : getClientAccount().hashCode());
        result = prime * result + ((getClientPassword() == null) ? 0 : getClientPassword().hashCode());
        result = prime * result + ((getClientTelephone() == null) ? 0 : getClientTelephone().hashCode());
        result = prime * result + ((getClientEmail() == null) ? 0 : getClientEmail().hashCode());
        result = prime * result + ((getClientProfile() == null) ? 0 : getClientProfile().hashCode());
        result = prime * result + ((getClientAge() == null) ? 0 : getClientAge().hashCode());
        result = prime * result + ((getClientBirthday() == null) ? 0 : getClientBirthday().hashCode());
        result = prime * result + ((getClientGender() == null) ? 0 : getClientGender().hashCode());
        result = prime * result + ((getClientAddress() == null) ? 0 : getClientAddress().hashCode());
        result = prime * result + ((getClientStatus() == null) ? 0 : getClientStatus().hashCode());
        result = prime * result + ((getClientField() == null) ? 0 : getClientField().hashCode());
        result = prime * result + ((getClientField1() == null) ? 0 : getClientField1().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientId=").append(clientId);
        sb.append(", clientName=").append(clientName);
        sb.append(", clientAccount=").append(clientAccount);
        sb.append(", clientPassword=").append(clientPassword);
        sb.append(", clientTelephone=").append(clientTelephone);
        sb.append(", clientEmail=").append(clientEmail);
        sb.append(", clientProfile=").append(clientProfile);
        sb.append(", clientAge=").append(clientAge);
        sb.append(", clientBirthday=").append(clientBirthday);
        sb.append(", clientGender=").append(clientGender);
        sb.append(", clientAddress=").append(clientAddress);
        sb.append(", clientStatus=").append(clientStatus);
        sb.append(", clientField=").append(clientField);
        sb.append(", clientField1=").append(clientField1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}