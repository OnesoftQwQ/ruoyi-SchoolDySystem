package com.ruoyi.project.nczxxj.nczxxjinfo.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 学生信息对象 nczx_xjbxs_info
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
public class XjbxsInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 年级 */
    @Excel(name = "年级")
    private String nj;

    /** 班级 */
    @Excel(name = "班级")
    private String bj;

    /** 班主任 */
    @Excel(name = "班主任")
    private String bzr;

    /** 学籍号 */
    private String xjh;

    /** 考生号 */
    private String ksh;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 性别 */
    @Excel(name = "性别",readConverterExp = "0=男,1=女,2=未知")
    private Integer xb;

    /** 民族 */
    @Excel(name = "民族")
    private String mz;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date csrq;

    /** 政治面貌 */
    private String zzmm;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String sfzh;

    /** 户口性质 */
    private String hkxz;

    /** 贫困等级 */
    private String pkdj;

    /** 生源地州 */
    @Excel(name = "生源地州")
    private String sydz;

    /** 县区 */
    @Excel(name = "县区")
    private String xianqu;

    /** 家庭住址 */
    private String jtzz;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String lxdh;

    /** 家长姓名 */
    private String jzxm;

    /** 家长联系电话 */
    private String jzlxdh;

    /** 是否内初班毕业 */
    private Integer sfncbby;

    /** 中考成绩 */
    private BigDecimal zkfs;

    /** 初中毕业学校 */
    private String ncbbyxx;

    /** 在校状态（1已毕业，0在校，2已离校，3已去世） */
    private Integer zxzt;

    /** 学生照片 */
    @Excel(name = "学生照片")
    private String stupic;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setNj(String nj)
    {
        this.nj = nj;
    }

    public String getNj()
    {
        return nj;
    }
    public void setBj(String bj)
    {
        this.bj = bj;
    }

    public String getBj()
    {
        return bj;
    }
    public void setBzr(String bzr)
    {
        this.bzr = bzr;
    }

    public String getBzr()
    {
        return bzr;
    }
    public void setXjh(String xjh)
    {
        this.xjh = xjh;
    }

    public String getXjh()
    {
        return xjh;
    }
    public void setKsh(String ksh)
    {
        this.ksh = ksh;
    }

    public String getKsh()
    {
        return ksh;
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
    public void setMz(String mz)
    {
        this.mz = mz;
    }

    public String getMz()
    {
        return mz;
    }
    public void setCsrq(Date csrq)
    {
        this.csrq = csrq;
    }

    public Date getCsrq()
    {
        return csrq;
    }
    public void setZzmm(String zzmm)
    {
        this.zzmm = zzmm;
    }

    public String getZzmm()
    {
        return zzmm;
    }
    public void setSfzh(String sfzh)
    {
        this.sfzh = sfzh;
    }

    public String getSfzh()
    {
        return sfzh;
    }
    public void setHkxz(String hkxz)
    {
        this.hkxz = hkxz;
    }

    public String getHkxz()
    {
        return hkxz;
    }
    public void setPkdj(String pkdj)
    {
        this.pkdj = pkdj;
    }

    public String getPkdj()
    {
        return pkdj;
    }
    public void setSydz(String sydz)
    {
        this.sydz = sydz;
    }

    public String getSydz()
    {
        return sydz;
    }
    public void setXianqu(String xianqu)
    {
        this.xianqu = xianqu;
    }

    public String getXianqu()
    {
        return xianqu;
    }
    public void setJtzz(String jtzz)
    {
        this.jtzz = jtzz;
    }

    public String getJtzz()
    {
        return jtzz;
    }
    public void setLxdh(String lxdh)
    {
        this.lxdh = lxdh;
    }

    public String getLxdh()
    {
        return lxdh;
    }
    public void setJzxm(String jzxm)
    {
        this.jzxm = jzxm;
    }

    public String getJzxm()
    {
        return jzxm;
    }
    public void setJzlxdh(String jzlxdh)
    {
        this.jzlxdh = jzlxdh;
    }

    public String getJzlxdh()
    {
        return jzlxdh;
    }
    public void setSfncbby(Integer sfncbby)
    {
        this.sfncbby = sfncbby;
    }

    public Integer getSfncbby()
    {
        return sfncbby;
    }
    public void setZkfs(BigDecimal zkfs)
    {
        this.zkfs = zkfs;
    }

    public BigDecimal getZkfs()
    {
        return zkfs;
    }
    public void setNcbbyxx(String ncbbyxx)
    {
        this.ncbbyxx = ncbbyxx;
    }

    public String getNcbbyxx()
    {
        return ncbbyxx;
    }
    public void setZxzt(Integer zxzt)
    {
        this.zxzt = zxzt;
    }

    public Integer getZxzt()
    {
        return zxzt;
    }
    public void setStupic(String stupic)
    {
        this.stupic = stupic;
    }

    public String getStupic()
    {
        return stupic;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("nj", getNj())
            .append("bj", getBj())
            .append("bzr", getBzr())
            .append("xjh", getXjh())
            .append("ksh", getKsh())
            .append("xm", getXm())
            .append("xb", getXb())
            .append("mz", getMz())
            .append("csrq", getCsrq())
            .append("zzmm", getZzmm())
            .append("sfzh", getSfzh())
            .append("hkxz", getHkxz())
            .append("pkdj", getPkdj())
            .append("sydz", getSydz())
            .append("xianqu", getXianqu())
            .append("jtzz", getJtzz())
            .append("lxdh", getLxdh())
            .append("jzxm", getJzxm())
            .append("jzlxdh", getJzlxdh())
            .append("sfncbby", getSfncbby())
            .append("zkfs", getZkfs())
            .append("ncbbyxx", getNcbbyxx())
            .append("zxzt", getZxzt())
            .append("stupic", getStupic())
            .toString();
    }
}
