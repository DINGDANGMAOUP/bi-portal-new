package com.yinlu.bi.portal.admin.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yinlu.bi.portal.common.model.BaseModel;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName systemUser
 */
@TableName(value ="systemUser")
@Data
public class SystemUser extends BaseModel implements Serializable {
    /**
     * 用户Id
     */
    @TableId(value = "UserId")
    private Integer userId;

    /**
     * 用户姓名
     */
    @TableField(value = "UserName")
    private String userName;

    /**
     * 域账号
     */
    @TableField(value = "DomainAccount")
    private String domainAccount;

    /**
     * 
     */
    @TableField(value = "EMPNumber")
    private String EMPNumber;

    /**
     * 邮箱
     */
    @TableField(value = "UserEmail")
    private String userEmail;

    /**
     * 性别
     */
    @TableField(value = "Gender")
    private String gender;

    /**
     * 性别Code
     */
    @TableField(value = "GenderCode")
    private Integer genderCode;

    /**
     * 移动电话
     */
    @TableField(value = "MobilePhone")
    private String mobilePhone;

    /**
     * 创建日期
     */
    @TableField(value = "CreateOn")
    private LocalDateTime createOn;

    /**
     * 修改日期
     */
    @TableField(value = "ModifiedOn")
    private LocalDateTime modifiedOn;

    /**
     * 
     */
    @TableField(value = "IsAdmin")
    private Boolean isAdmin;

    /**
     * 
     */
    @TableField(value = "GroupId")
    private Integer groupId;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Boolean status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        SystemUser other = (SystemUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getDomainAccount() == null ? other.getDomainAccount() == null : this.getDomainAccount().equals(other.getDomainAccount()))
            && (this.getEMPNumber() == null ? other.getEMPNumber() == null : this.getEMPNumber().equals(other.getEMPNumber()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getGenderCode() == null ? other.getGenderCode() == null : this.getGenderCode().equals(other.getGenderCode()))
            && (this.getMobilePhone() == null ? other.getMobilePhone() == null : this.getMobilePhone().equals(other.getMobilePhone()))
            && (this.getCreateOn() == null ? other.getCreateOn() == null : this.getCreateOn().equals(other.getCreateOn()))
            && (this.getModifiedOn() == null ? other.getModifiedOn() == null : this.getModifiedOn().equals(other.getModifiedOn()))
            && (this.getIsAdmin() == null ? other.getIsAdmin() == null : this.getIsAdmin().equals(other.getIsAdmin()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getDomainAccount() == null) ? 0 : getDomainAccount().hashCode());
        result = prime * result + ((getEMPNumber() == null) ? 0 : getEMPNumber().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getGenderCode() == null) ? 0 : getGenderCode().hashCode());
        result = prime * result + ((getMobilePhone() == null) ? 0 : getMobilePhone().hashCode());
        result = prime * result + ((getCreateOn() == null) ? 0 : getCreateOn().hashCode());
        result = prime * result + ((getModifiedOn() == null) ? 0 : getModifiedOn().hashCode());
        result = prime * result + ((getIsAdmin() == null) ? 0 : getIsAdmin().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", domainAccount=").append(domainAccount);
        sb.append(", EMPNumber=").append(EMPNumber);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", gender=").append(gender);
        sb.append(", genderCode=").append(genderCode);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", createOn=").append(createOn);
        sb.append(", modifiedOn=").append(modifiedOn);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", groupId=").append(groupId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}