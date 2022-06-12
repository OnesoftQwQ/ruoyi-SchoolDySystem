package com.ruoyi.project.nczxxj.nczxxjinfo.mapper;

import java.util.List;
import com.ruoyi.project.nczxxj.nczxxjinfo.domain.XjbxsInfo;

/**
 * 学生信息Mapper接口
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
public interface XjbxsInfoMapper 
{
    /**
     * 查询学生信息
     * 
     * @param id 学生信息ID
     * @return 学生信息
     */
    public XjbxsInfo selectXjbxsInfoById(Long id);

    /**
     * 查询学生信息列表
     * 
     * @param xjbxsInfo 学生信息
     * @return 学生信息集合
     */
    public List<XjbxsInfo> selectXjbxsInfoList(XjbxsInfo xjbxsInfo);

    /**
     * 新增学生信息
     * 
     * @param xjbxsInfo 学生信息
     * @return 结果
     */
    public int insertXjbxsInfo(XjbxsInfo xjbxsInfo);

    /**
     * 修改学生信息
     * 
     * @param xjbxsInfo 学生信息
     * @return 结果
     */
    public int updateXjbxsInfo(XjbxsInfo xjbxsInfo);

    /**
     * 删除学生信息
     * 
     * @param id 学生信息ID
     * @return 结果
     */
    public int deleteXjbxsInfoById(Long id);

    /**
     * 批量删除学生信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteXjbxsInfoByIds(String[] ids);
}
