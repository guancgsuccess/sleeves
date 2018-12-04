package com.chixing.entity;

import java.io.Serializable;

/**
 * company
 * @author 
 */
public class Company implements Serializable {
    /**
     * 公司id
     */
    private Integer companyId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司营业执照
     */
    private String companyLicenseNo;

    /**
     * 公司密码
     */
    private String companyPassword;

    /**
     * 公司法人
     */
    private String companyLegalPerson;

    /**
     * 公司电话
     */
    private Long companyTelephone;

    /**
     * 公司邮箱
     */
    private String companyEmail;

    /**
     * 公司地址
     */
    private String companyLocation;

    /**
     * 公司状态
     */
    private Integer companyStatus;

    /**
     * 冗余字段1
     */
    private String field1;

    /**
     * 冗余字段2
     */
    private String field2;

    private static final long serialVersionUID = 1L;

    public Company() {
    }


    public Company(Integer companyId, String companyName, String companyLicenseNo, String companyPassword, String companyLegalPerson, Long companyTelephone, String companyEmail, String companyLocation, Integer companyStatus, String field1, String field2) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyLicenseNo = companyLicenseNo;
        this.companyPassword = companyPassword;
        this.companyLegalPerson = companyLegalPerson;
        this.companyTelephone = companyTelephone;
        this.companyEmail = companyEmail;
        this.companyLocation = companyLocation;
        this.companyStatus = companyStatus;
        this.field1 = field1;
        this.field2 = field2;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLicenseNo() {
        return companyLicenseNo;
    }

    public void setCompanyLicenseNo(String companyLicenseNo) {
        this.companyLicenseNo = companyLicenseNo;
    }

    public String getCompanyPassword() {
        return companyPassword;
    }

    public void setCompanyPassword(String companyPassword) {
        this.companyPassword = companyPassword;
    }

    public String getCompanyLegalPerson() {
        return companyLegalPerson;
    }

    public void setCompanyLegalPerson(String companyLegalPerson) {
        this.companyLegalPerson = companyLegalPerson;
    }

    public Long getCompanyTelephone() {
        return companyTelephone;
    }

    public void setCompanyTelephone(Long companyTelephone) {
        this.companyTelephone = companyTelephone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public Integer getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
        Company other = (Company) that;
        return (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyLicenseNo() == null ? other.getCompanyLicenseNo() == null : this.getCompanyLicenseNo().equals(other.getCompanyLicenseNo()))
            && (this.getCompanyPassword() == null ? other.getCompanyPassword() == null : this.getCompanyPassword().equals(other.getCompanyPassword()))
            && (this.getCompanyLegalPerson() == null ? other.getCompanyLegalPerson() == null : this.getCompanyLegalPerson().equals(other.getCompanyLegalPerson()))
            && (this.getCompanyTelephone() == null ? other.getCompanyTelephone() == null : this.getCompanyTelephone().equals(other.getCompanyTelephone()))
            && (this.getCompanyEmail() == null ? other.getCompanyEmail() == null : this.getCompanyEmail().equals(other.getCompanyEmail()))
            && (this.getCompanyLocation() == null ? other.getCompanyLocation() == null : this.getCompanyLocation().equals(other.getCompanyLocation()))
            && (this.getCompanyStatus() == null ? other.getCompanyStatus() == null : this.getCompanyStatus().equals(other.getCompanyStatus()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyLicenseNo() == null) ? 0 : getCompanyLicenseNo().hashCode());
        result = prime * result + ((getCompanyPassword() == null) ? 0 : getCompanyPassword().hashCode());
        result = prime * result + ((getCompanyLegalPerson() == null) ? 0 : getCompanyLegalPerson().hashCode());
        result = prime * result + ((getCompanyTelephone() == null) ? 0 : getCompanyTelephone().hashCode());
        result = prime * result + ((getCompanyEmail() == null) ? 0 : getCompanyEmail().hashCode());
        result = prime * result + ((getCompanyLocation() == null) ? 0 : getCompanyLocation().hashCode());
        result = prime * result + ((getCompanyStatus() == null) ? 0 : getCompanyStatus().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyLicenseNo='" + companyLicenseNo + '\'' +
                ", companyPassword='" + companyPassword + '\'' +
                ", companyLegalPerson='" + companyLegalPerson + '\'' +
                ", companyTelephone=" + companyTelephone +
                ", companyEmail='" + companyEmail + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", companyStatus=" + companyStatus +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }
}