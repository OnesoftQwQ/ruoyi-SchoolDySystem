package com.ruoyi.project.nczxsushe.sushe.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 宿舍检查对象 nczx_sushe_main
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
public class NczxSusheMain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 周名称 */
    @Excel(name = "周名称")
    private String weekname;

    /** 周数 */
    @Excel(name = "周数")
    private String weeknum;

    /** 检查人 */
    @Excel(name = "检查人")
    private String checkedBy;

    /** 宿舍检查明细信息 */
    private List<NczxSusheSub> nczxSusheSubList;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setWeekname(String weekname)
    {
        this.weekname = weekname;
    }

    public String getWeekname()
    {
        return weekname;
    }
    public void setWeeknum(String weeknum)
    {
        this.weeknum = weeknum;
    }

    public String getWeeknum()
    {
        return weeknum;
    }
    public void setCheckedBy(String checkedBy)
    {
        this.checkedBy = checkedBy;
    }

    public String getCheckedBy()
    {
        return checkedBy;
    }

    public List<NczxSusheSub> getNczxSusheSubList()
    {
        return nczxSusheSubList;
    }

    public void setNczxSusheSubList(List<NczxSusheSub> nczxSusheSubList)
    {
        this.nczxSusheSubList = nczxSusheSubList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("weekname", getWeekname())
            .append("weeknum", getWeeknum())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("checkedBy", getCheckedBy())
            .append("nczxSusheSubList", getNczxSusheSubList())
            .toString();
    }
}
