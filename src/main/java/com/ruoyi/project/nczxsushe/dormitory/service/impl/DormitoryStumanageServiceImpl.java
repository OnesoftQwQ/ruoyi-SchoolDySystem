package com.ruoyi.project.nczxsushe.dormitory.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.nczxsushe.dormitory.mapper.DormitoryStumanageMapper;
import com.ruoyi.project.nczxsushe.dormitory.domain.DormitoryStumanage;
import com.ruoyi.project.nczxsushe.dormitory.service.IDormitoryStumanageService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 住宿生信息Service业务层处理
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
@Service
public class DormitoryStumanageServiceImpl implements IDormitoryStumanageService 
{
    @Autowired
    private DormitoryStumanageMapper dormitoryStumanageMapper;

    /**
     * 查询住宿生信息
     *
     * @param sid 住宿生信息ID
     * @return 住宿生信息
     */
    @Override
    public DormitoryStumanage selectDormitoryStumanageById(Long sid)
    {
        return dormitoryStumanageMapper.selectDormitoryStumanageById(sid);
    }

    /**
     * 查询住宿生信息列表
     *
     * @param dormitoryStumanage 住宿生信息
     * @return 住宿生信息
     */
    @Override
    public List<DormitoryStumanage> selectDormitoryStumanageList(DormitoryStumanage dormitoryStumanage)
    {
        return dormitoryStumanageMapper.selectDormitoryStumanageList(dormitoryStumanage);
    }

    /**
     * 新增住宿生信息
     *
     * @param dormitoryStumanage 住宿生信息
     * @return 结果
     */
    @Override
    public int insertDormitoryStumanage(DormitoryStumanage dormitoryStumanage)
    {
        dormitoryStumanage.setCreateTime(DateUtils.getNowDate());
        return dormitoryStumanageMapper.insertDormitoryStumanage(dormitoryStumanage);
    }

    /**
     * 修改住宿生信息
     *
     * @param dormitoryStumanage 住宿生信息
     * @return 结果
     */
    @Override
    public int updateDormitoryStumanage(DormitoryStumanage dormitoryStumanage)
    {
        dormitoryStumanage.setUpdateTime(DateUtils.getNowDate());
        return dormitoryStumanageMapper.updateDormitoryStumanage(dormitoryStumanage);
    }

    /**
     * 删除住宿生信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDormitoryStumanageByIds(String ids)
    {
        return dormitoryStumanageMapper.deleteDormitoryStumanageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除住宿生信息信息
     *
     * @param sid 住宿生信息ID
     * @return 结果
     */
    @Override
    public int deleteDormitoryStumanageById(Long sid)
    {
        return dormitoryStumanageMapper.deleteDormitoryStumanageById(sid);
    }

    @Override
    public List<DormitoryStumanage> selectDormitoryStumanageDormitoryNum(Integer dormitoryNum) {
        return dormitoryStumanageMapper.selectDormitoryStumanageDormitoryNum(dormitoryNum);
    }
}
