package com.ruoyi.project.nczxxj.nczxxjinfo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.nczxxj.nczxxjinfo.mapper.XjbxsInfoMapper;
import com.ruoyi.project.nczxxj.nczxxjinfo.domain.XjbxsInfo;
import com.ruoyi.project.nczxxj.nczxxjinfo.service.IXjbxsInfoService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 学生信息Service业务层处理
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
@Service
public class XjbxsInfoServiceImpl implements IXjbxsInfoService 
{
    @Autowired
    private XjbxsInfoMapper xjbxsInfoMapper;

    /**
     * 查询学生信息
     * 
     * @param id 学生信息ID
     * @return 学生信息
     */
    @Override
    public XjbxsInfo selectXjbxsInfoById(Long id)
    {
        return xjbxsInfoMapper.selectXjbxsInfoById(id);
    }

    /**
     * 查询学生信息列表
     * 
     * @param xjbxsInfo 学生信息
     * @return 学生信息
     */
    @Override
    public List<XjbxsInfo> selectXjbxsInfoList(XjbxsInfo xjbxsInfo)
    {
        return xjbxsInfoMapper.selectXjbxsInfoList(xjbxsInfo);
    }

    /**
     * 新增学生信息
     * 
     * @param xjbxsInfo 学生信息
     * @return 结果
     */
    @Override
    public int insertXjbxsInfo(XjbxsInfo xjbxsInfo)
    {
        return xjbxsInfoMapper.insertXjbxsInfo(xjbxsInfo);
    }

    /**
     * 修改学生信息
     * 
     * @param xjbxsInfo 学生信息
     * @return 结果
     */
    @Override
    public int updateXjbxsInfo(XjbxsInfo xjbxsInfo)
    {
        return xjbxsInfoMapper.updateXjbxsInfo(xjbxsInfo);
    }

    /**
     * 删除学生信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteXjbxsInfoByIds(String ids)
    {
        return xjbxsInfoMapper.deleteXjbxsInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生信息信息
     * 
     * @param id 学生信息ID
     * @return 结果
     */
    @Override
    public int deleteXjbxsInfoById(Long id)
    {
        return xjbxsInfoMapper.deleteXjbxsInfoById(id);
    }
}
