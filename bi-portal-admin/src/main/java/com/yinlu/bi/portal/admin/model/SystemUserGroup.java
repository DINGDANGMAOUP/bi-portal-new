package com.yinlu.bi.portal.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yinlu.bi.portal.common.model.BaseModel;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName systemUserGroup
 */
@TableName(value ="systemUserGroup")
@Data
public class SystemUserGroup extends BaseModel implements Serializable {
    /**
     * 
     */
//    @TableField(value = "GroupId")
    @TableId(value = "GroupId",type = IdType.AUTO)
    private Integer groupId;

    /**
     * 
     */
    @TableField(value = "GroupName")
    private String groupName;

    /**
     * 
     */
    @TableField(value = "Status")
    private Boolean status;

    /**
     * 
     */
    @TableField(value = "CreateOn")
    private LocalDateTime createOn;

    /**
     * 
     */
    @TableField(value = "ModifiedOn")
    private LocalDateTime modifiedOn;

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
        SystemUserGroup other = (SystemUserGroup) that;
        return (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateOn() == null ? other.getCreateOn() == null : this.getCreateOn().equals(other.getCreateOn()))
            && (this.getModifiedOn() == null ? other.getModifiedOn() == null : this.getModifiedOn().equals(other.getModifiedOn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateOn() == null) ? 0 : getCreateOn().hashCode());
        result = prime * result + ((getModifiedOn() == null) ? 0 : getModifiedOn().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", status=").append(status);
        sb.append(", createOn=").append(createOn);
        sb.append(", modifiedOn=").append(modifiedOn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}