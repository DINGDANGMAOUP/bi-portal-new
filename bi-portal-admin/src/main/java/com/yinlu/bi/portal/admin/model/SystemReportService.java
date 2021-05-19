package com.yinlu.bi.portal.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yinlu.bi.portal.common.model.BaseModel;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

/** @TableName systemReportService */
@TableName(value = "systemReportService")
@Data
public class SystemReportService extends BaseModel implements Serializable {
  /** */
//  @TableField(value = "RId")
  @TableId(value = "RId",type = IdType.AUTO)
  private Integer RId;

  /** */
  @TableField(value = "RName")
  private String RName;

  /** */
  @TableField(value = "RPId")
  private Integer RPId;

  /** */
  @TableField(value = "RUrl")
  private String RUrl;

  /** */
  @TableField(value = "RPName")
  private String RPName;

  /** */
  @TableField(value = "CreateOn")
  private LocalDateTime createOn;

  /** */
  @TableField(value = "ModifiedOn")
  private LocalDateTime modifiedOn;

  /** */
  @TableField(value = "IsHome")
  private Boolean isHome;

  /** */
  @TableField(value = "status")
  private Boolean status;

  /** */
  @TableField(value = "RSort")
  private Integer RSort;

  /** */
  @TableField(value = "PicClass")
  private String picClass;

  /** 20170406这个字段是后面加的，用来控制报表网址要不要带用户进去判断 */
  @TableField(value = "IsUserControl")
  private Integer isUserControl;

  @TableField(exist = false)
  private int level;

  @TableField(exist = false)
  private List<SystemReportService> children;

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
    SystemReportService other = (SystemReportService) that;
    return (this.getRId() == null ? other.getRId() == null : this.getRId().equals(other.getRId()))
        && (this.getRName() == null
            ? other.getRName() == null
            : this.getRName().equals(other.getRName()))
        && (this.getRPId() == null
            ? other.getRPId() == null
            : this.getRPId().equals(other.getRPId()))
        && (this.getRUrl() == null
            ? other.getRUrl() == null
            : this.getRUrl().equals(other.getRUrl()))
        && (this.getRPName() == null
            ? other.getRPName() == null
            : this.getRPName().equals(other.getRPName()))
        && (this.getCreateOn() == null
            ? other.getCreateOn() == null
            : this.getCreateOn().equals(other.getCreateOn()))
        && (this.getModifiedOn() == null
            ? other.getModifiedOn() == null
            : this.getModifiedOn().equals(other.getModifiedOn()))
        && (this.getIsHome() == null
            ? other.getIsHome() == null
            : this.getIsHome().equals(other.getIsHome()))
        && (this.getStatus() == null
            ? other.getStatus() == null
            : this.getStatus().equals(other.getStatus()))
        && (this.getRSort() == null
            ? other.getRSort() == null
            : this.getRSort().equals(other.getRSort()))
        && (this.getPicClass() == null
            ? other.getPicClass() == null
            : this.getPicClass().equals(other.getPicClass()))
        && (this.getIsUserControl() == null
            ? other.getIsUserControl() == null
            : this.getIsUserControl().equals(other.getIsUserControl()));
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((getRId() == null) ? 0 : getRId().hashCode());
    result = prime * result + ((getRName() == null) ? 0 : getRName().hashCode());
    result = prime * result + ((getRPId() == null) ? 0 : getRPId().hashCode());
    result = prime * result + ((getRUrl() == null) ? 0 : getRUrl().hashCode());
    result = prime * result + ((getRPName() == null) ? 0 : getRPName().hashCode());
    result = prime * result + ((getCreateOn() == null) ? 0 : getCreateOn().hashCode());
    result = prime * result + ((getModifiedOn() == null) ? 0 : getModifiedOn().hashCode());
    result = prime * result + ((getIsHome() == null) ? 0 : getIsHome().hashCode());
    result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
    result = prime * result + ((getRSort() == null) ? 0 : getRSort().hashCode());
    result = prime * result + ((getPicClass() == null) ? 0 : getPicClass().hashCode());
    result = prime * result + ((getIsUserControl() == null) ? 0 : getIsUserControl().hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", RId=").append(RId);
    sb.append(", RName=").append(RName);
    sb.append(", RPId=").append(RPId);
    sb.append(", RUrl=").append(RUrl);
    sb.append(", RPName=").append(RPName);
    sb.append(", createOn=").append(createOn);
    sb.append(", modifiedOn=").append(modifiedOn);
    sb.append(", isHome=").append(isHome);
    sb.append(", status=").append(status);
    sb.append(", RSort=").append(RSort);
    sb.append(", picClass=").append(picClass);
    sb.append(", isUserControl=").append(isUserControl);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}
