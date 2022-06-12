package com.ruoyi.project.nczxsushe.dormitory.mapper;

import java.util.List;
import com.ruoyi.project.nczxsushe.dormitory.domain.DormitoryStumanage;
import com.ruoyi.project.system.dict.domain.DictData;

/**
 * 住宿生信息Mapper接口
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
public interface DormitoryStumanageMapper 
{
    /**
     * 查询住宿生信息
     *
     * @param sid 住宿生信息ID
     * @return 住宿生信息
     */
    public DormitoryStumanage selectDormitoryStumanageById(Long sid);

    /**
     * 查询住宿生信息列表
     *
     * @param dormitoryStumanage 住宿生信息
     * @return 住宿生信息集合
     */
    public List<DormitoryStumanage> selectDormitoryStumanageList(DormitoryStumanage dormitoryStumanage);

    /**
     * 新增住宿生信息
     *
     * @param dormitoryStumanage 住宿生信息
     * @return 结果
     */
    public int insertDormitoryStumanage(DormitoryStumanage dormitoryStumanage);

    /**
     * 修改住宿生信息
     *
     * @param dormitoryStumanage 住宿生信息
     * @return 结果
     */
    public int updateDormitoryStumanage(DormitoryStumanage dormitoryStumanage);

    /**
     * 删除住宿生信息
     *
     * @param sid 住宿生信息ID
     * @return 结果
     */
    public int deleteDormitoryStumanageById(Long sid);

    /**
     * 批量删除住宿生信息
     *
     * @param sids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDormitoryStumanageByIds(String[] sids);

    /**
     * 根据宿舍号查询住校生数据
     *
     * @param dormitoryNum 宿舍号
     * @return 住校生数据集合信息
     */
    public List<DormitoryStumanage> selectDormitoryStumanageDormitoryNum(Integer dormitoryNum);
}
