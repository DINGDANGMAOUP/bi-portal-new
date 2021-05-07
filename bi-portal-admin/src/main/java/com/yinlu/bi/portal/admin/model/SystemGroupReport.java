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
 * @TableName systemGroupReport
 */
@TableName(value ="systemGroupReport")
@Data
public class SystemGroupReport extends BaseModel implements Serializable {
    /**
     * 
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "GroupId")
    private Integer groupId;

    /**
     * 
     */
    @TableField(value = "ReportId")
    private Integer reportId;

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

    /**
     * 
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
        SystemGroupReport other = (SystemGroupReport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getCreateOn() == null ? other.getCreateOn() == null : this.getCreateOn().equals(other.getCreateOn()))
            && (this.getModifiedOn() == null ? other.getModifiedOn() == null : this.getModifiedOn().equals(other.getModifiedOn()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getCreateOn() == null) ? 0 : getCreateOn().hashCode());
        result = prime * result + ((getModifiedOn() == null) ? 0 : getModifiedOn().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", reportId=").append(reportId);
        sb.append(", createOn=").append(createOn);
        sb.append(", modifiedOn=").append(modifiedOn);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}