package com.ruoyi.project.nczxsushe.dormitory.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 住宿生信息对象 nczx_dormitory_stumanage
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
public class DormitoryStumanage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long sid;

    /** 学生编号 */
    @Excel(name = "学生编号")
    private Long stuNo;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String stuName;

    /** 年级 */
    @Excel(name = "年级")
    private String stuGrade;

    /** 班级 */
    @Excel(name = "班级")
    private String stuClass;

    /** 床号 */
    @Excel(name = "床号")
    private Integer stuBedno;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String stuTell;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String stuAddress;

    /** 照片 */
    @Excel(name = "照片")
    private String stuAvatar;

    /** 状态 */
    @Excel(name = "状态")
    private Long stustatus;

    /** 入住时间 */
    @Excel(name = "入住时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inDate;

    /** 宿舍号 */
    @Excel(name = "宿舍号")
    private Long dormitoryNum;

    /** 退宿时间 */
    @Excel(name = "退宿时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date outDate;

    public void setSid(Long sid)
    {
        this.sid = sid;
    }

    public Long getSid()
    {
        return sid;
    }
    public void setStuNo(Long stuNo)
    {
        this.stuNo = stuNo;
    }

    public Long getStuNo()
    {
        return stuNo;
    }
    public void setStuName(String stuName)
    {
        this.stuName = stuName;
    }

    public String getStuName()
    {
        return stuName;
    }
    public void setStuGrade(String stuGrade)
    {
        this.stuGrade = stuGrade;
    }

    public String getStuGrade()
    {
        return stuGrade;
    }
    public void setStuClass(String stuClass)
    {
        this.stuClass = stuClass;
    }

    public String getStuClass()
    {
        return stuClass;
    }
    public void setStuBedno(Integer stuBedno)
    {
        this.stuBedno = stuBedno;
    }

    public Integer getStuBedno()
    {
        return stuBedno;
    }
    public void setStuTell(String stuTell)
    {
        this.stuTell = stuTell;
    }

    public String getStuTell()
    {
        return stuTell;
    }
    public void setStuAddress(String stuAddress)
    {
        this.stuAddress = stuAddress;
    }

    public String getStuAddress()
    {
        return stuAddress;
    }
    public void setStuAvatar(String stuAvatar)
    {
        this.stuAvatar = stuAvatar;
    }

    public String getStuAvatar()
    {
        return stuAvatar;
    }
    public void setStustatus(Long stustatus)
    {
        this.stustatus = stustatus;
    }

    public Long getStustatus()
    {
        return stustatus;
    }
    public void setInDate(Date inDate)
    {
        this.inDate = inDate;
    }

    public Date getInDate()
    {
        return inDate;
    }
    public void setDormitoryNum(Long dormitoryNum)
    {
        this.dormitoryNum = dormitoryNum;
    }

    public Long getDormitoryNum()
    {
        return dormitoryNum;
    }
    public void setOutDate(Date outDate)
    {
        this.outDate = outDate;
    }

    public Date getOutDate()
    {
        return outDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("sid", getSid())
                .append("stuNo", getStuNo())
                .append("stuName", getStuName())
                .append("stuGrade", getStuGrade())
                .append("stuClass", getStuClass())
                .append("stuBedno", getStuBedno())
                .append("stuTell", getStuTell())
                .append("stuAddress", getStuAddress())
                .append("stuAvatar", getStuAvatar())
                .append("stustatus", getStustatus())
                .append("inDate", getInDate())
                .append("dormitoryNum", getDormitoryNum())
                .append("outDate", getOutDate())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("createBy", getCreateBy())
                .append("remark", getRemark())
                .toString();
    }
}