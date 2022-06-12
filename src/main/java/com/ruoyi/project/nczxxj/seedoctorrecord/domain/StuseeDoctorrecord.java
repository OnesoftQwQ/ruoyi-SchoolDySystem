package com.ruoyi.project.nczxxj.seedoctorrecord.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 看病记录对象 nczx_stusee_doctorrecord
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
public class StuseeDoctorrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String xm;

    /** 学生性别 */
    @Excel(name = "学生性别",readConverterExp = "0=男,1=女,2=未知")
    private Integer xb;

    /** 学生班级 */
    @Excel(name = "学生班级")
    private String bj;

    /** 带队教师 */
    @Excel(name = "带队教师")
    private String ddjs;

    /** 就诊原因 */
    private String reason;

    /** 就诊医院 */
    @Excel(name = "就诊医院")
    private String jzyy;

    /** 就诊科室 */
    @Excel(name = "就诊科室")
    private String jzks;

    /** 外出时间 */
    @Excel(name = "外出时间", width = 40, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date wcsj;

    /** 回校时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "回校时间", width = 40, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date hxsj;

    /** 看病费用 */
    private BigDecimal cost;

    /** 医生用药 */
    private String ysyy;

    /** 看病结果 */
    private String resulttype;

    /** 相关文件 */
    private String files;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setXm(String xm)
    {
        this.xm = xm;
    }

    public String getXm()
    {
        return xm;
    }
    public void setXb(Integer xb)
    {
        this.xb = xb;
    }

    public Integer getXb()
    {
        return xb;
    }
    public void setBj(String bj)
    {
        this.bj = bj;
    }

    public String getBj()
    {
        return bj;
    }
    public void setDdjs(String ddjs)
    {
        this.ddjs = ddjs;
    }

    public String getDdjs()
    {
        return ddjs;
    }
    public void setReason(String reason)
    {
        this.reason = reason;
    }

    public String getReason()
    {
        return reason;
    }
    public void setJzyy(String jzyy)
    {
        this.jzyy = jzyy;
    }

    public String getJzyy()
    {
        return jzyy;
    }
    public void setJzks(String jzks)
    {
        this.jzks = jzks;
    }

    public String getJzks()
    {
        return jzks;
    }
    public void setWcsj(Date wcsj)
    {
        this.wcsj = wcsj;
    }

    public Date getWcsj()
    {
        return wcsj;
    }
    public void setHxsj(Date hxsj)
    {
        this.hxsj = hxsj;
    }

    public Date getHxsj()
    {
        return hxsj;
    }
    public void setCost(BigDecimal cost)
    {
        this.cost = cost;
    }

    public BigDecimal getCost()
    {
        return cost;
    }
    public void setYsyy(String ysyy)
    {
        this.ysyy = ysyy;
    }

    public String getYsyy()
    {
        return ysyy;
    }
    public void setResulttype(String resulttype)
    {
        this.resulttype = resulttype;
    }

    public String getResulttype()
    {
        return resulttype;
    }
    public void setFiles(String files)
    {
        this.files = files;
    }

    public String getFiles()
    {
        return files;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("xb", getXb())
            .append("bj", getBj())
            .append("ddjs", getDdjs())
            .append("reason", getReason())
            .append("jzyy", getJzyy())
            .append("jzks", getJzks())
            .append("wcsj", getWcsj())
            .append("hxsj", getHxsj())
            .append("cost", getCost())
            .append("ysyy", getYsyy())
            .append("createBy", getCreateBy())
            .append("resulttype", getResulttype())
            .append("remark", getRemark())
            .append("files", getFiles())
            .append("createTime", getCreateTime())
            .toString();
    }
}
