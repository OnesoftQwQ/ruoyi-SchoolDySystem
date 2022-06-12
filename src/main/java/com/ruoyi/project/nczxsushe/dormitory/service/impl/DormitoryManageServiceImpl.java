package com.ruoyi.project.nczxsushe.dormitory.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.nczxsushe.dormitory.mapper.DormitoryManageMapper;
import com.ruoyi.project.nczxsushe.dormitory.domain.DormitoryManage;
import com.ruoyi.project.nczxsushe.dormitory.service.IDormitoryManageService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 宿舍Service业务层处理
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
@Service
public class DormitoryManageServiceImpl implements IDormitoryManageService 
{
    @Autowired
    private DormitoryManageMapper dormitoryManageMapper;

    /**
     * 查询所有的信息
     * @param dormitoryManage 宿舍信息
     * @return
     */
    @Override
    public List<DormitoryManage> selectDormitoryManageList(DormitoryManage dormitoryManage) {
        return dormitoryManageMapper.selectDormitoryManageList(dormitoryManage);
    }

    /**
     * 所有信息集合
     * @return
     */
    @Override
    public List<DormitoryManage> selectDormitoryManageAll() {
        return dormitoryManageMapper.selectDormitoryManageAll();
    }

    /**
     * 根据ID查询
     * @param id 宿舍ID
     * @return
     */
    @Override
    public DormitoryManage selectDormitoryManageById(Long id) {
        return dormitoryManageMapper.selectDormitoryManageById(id);
    }

    /**
     * 根据ID链表查询相应宿舍的住校生
     * @param id 宿舍ID
     * @return
     */
    @Override
    public DormitoryManage selectDormitoryManageInfoById(Long id) {
        return dormitoryManageMapper.selectDormitoryManageInfoById(id);
    }

    /**
     * 根据id删除宿舍信息
     * @param id 宿舍ID
     * @return
     */
    @Override
    public int deleteDormitoryManageById(Long id) {
        return dormitoryManageMapper.deleteDormitoryManageById(id);
    }

    /**
     * 删除宿舍对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDormitoryManageByIds(String ids)
    {
        return dormitoryManageMapper.deleteDormitoryManageByIds(Convert.toStrArray(ids));
    }

    /**
     * 新增宿舍信息
     * @param dormitoryManage 宿舍信息
     * @return
     */
    @Override
    public int insertDormitoryManage(DormitoryManage dormitoryManage) {
        dormitoryManage.setCreateTime(DateUtils.getNowDate());
        dormitoryManage.setCreateBy(ShiroUtils.getLoginName());
        return dormitoryManageMapper.insertDormitoryManage(dormitoryManage);
    }

    /**
     * 更新宿舍信息
     * @param dormitoryManage 宿舍信息
     * @return
     */
    @Override
    public int updateDormitoryManage(DormitoryManage dormitoryManage) {
        dormitoryManage.setUpdateTime(DateUtils.getNowDate());
        return dormitoryManageMapper.updateDormitoryManage(dormitoryManage);
    }
}
