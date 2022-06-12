package com.ruoyi.project.student.studenttalk.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 谈心谈话记录对象 nczx_talkwith_student
 * 
 * @author 阿卜
 * @date 2020-12-14
 */
public class NczxTalkwithStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Integer itemId;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String teachername;

    /** 教师所属部门 */
    @Excel(name = "教师所属部门")
    private String teacherorg;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String stuname;

    /** 学生性别 */
    @Excel(name = "学生性别",readConverterExp = "0=男,1=女,2=未知")
    private String stusex;

    /** 学生班级 */
    @Excel(name = "学生班级")
    private String stuclass;

    /** 家长联系方式 */
    @Excel(name = "家长联系方式")
    private String stutell;

    /** 谈话时间 */
    @Excel(name = "谈话时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date talktime;

    /** 谈话地点 */
    @Excel(name = "谈话地点")
    private String talkplace;

    /** 学生情况 */
    private String talkcontent;

    /** 帮扶措施及效果 */
    private String talkresult;

    /** 谈话照片 */
    @Excel(name = "谈话照片")
    private String talkimg;

    public void setItemId(Integer itemId)
    {
        this.itemId = itemId;
    }

    public Integer getItemId()
    {
        return itemId;
    }
    public void setTeachername(String teachername)
    {
        this.teachername = teachername;
    }

    public String getTeachername()
    {
        return teachername;
    }
    public void setTeacherorg(String teacherorg)
    {
        this.teacherorg = teacherorg;
    }

    public String getTeacherorg()
    {
        return teacherorg;
    }
    public void setStuname(String stuname)
    {
        this.stuname = stuname;
    }

    public String getStuname()
    {
        return stuname;
    }
    public void setStusex(String stusex)
    {
        this.stusex = stusex;
    }

    public String getStusex()
    {
        return stusex;
    }
    public void setStuclass(String stuclass)
    {
        this.stuclass = stuclass;
    }

    public String getStuclass()
    {
        return stuclass;
    }
    public void setStutell(String stutell)
    {
        this.stutell = stutell;
    }

    public String getStutell()
    {
        return stutell;
    }
    public void setTalktime(Date talktime)
    {
        this.talktime = talktime;
    }

    public Date getTalktime()
    {
        return talktime;
    }
    public void setTalkplace(String talkplace)
    {
        this.talkplace = talkplace;
    }

    public String getTalkplace()
    {
        return talkplace;
    }
    public void setTalkcontent(String talkcontent)
    {
        this.talkcontent = talkcontent;
    }

    public String getTalkcontent()
    {
        return talkcontent;
    }
    public void setTalkresult(String talkresult)
    {
        this.talkresult = talkresult;
    }

    public String getTalkresult()
    {
        return talkresult;
    }
    public void setTalkimg(String talkimg)
    {
        this.talkimg = talkimg;
    }

    public String getTalkimg()
    {
        return talkimg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemId", getItemId())
            .append("teachername", getTeachername())
            .append("teacherorg", getTeacherorg())
            .append("stuname", getStuname())
            .append("stusex", getStusex())
            .append("stuclass", getStuclass())
            .append("stutell", getStutell())
            .append("talktime", getTalktime())
            .append("talkplace", getTalkplace())
            .append("talkcontent", getTalkcontent())
            .append("talkresult", getTalkresult())
            .append("talkimg", getTalkimg())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .toString();
    }
}
