package com.ruoyi.project.nczxsushe.dormitory.mapper;

import java.util.List;
import com.ruoyi.project.nczxsushe.dormitory.domain.DormitoryManage;
import com.ruoyi.project.nczxsushe.dormitory.domain.DormitoryStumanage;
import com.ruoyi.project.system.dict.domain.DictType;

/**
 * 宿舍Mapper接口
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
public interface DormitoryManageMapper 
{
    /**
     * 根据条件分页查询宿舍信息
     * @param dormitoryManage 宿舍信息
     * @return 返回宿舍集合信息
     */
    public List<DormitoryManage> selectDormitoryManageList(DormitoryManage dormitoryManage);

    /**
     * 根据所有宿舍信息
     *
     * @return 返回宿舍集合信息
     */
    public List<DormitoryManage> selectDormitoryManageAll();

    /**
     * 根据宿舍ID查询信息
     *
     * @param id 宿舍ID
     * @return 返回相应的宿舍信息
     */
    public DormitoryManage selectDormitoryManageById(Long id);

    /**
     * 根据宿舍ID查询所有信息
     * 为了查看学生及宿舍信息
     * @param id 宿舍ID
     * @return 返回相应的宿舍信息
     */
    public DormitoryManage selectDormitoryManageInfoById(Long id);

    /**
     * 通过宿舍ID删除宿舍信息
     *
     * @param id 宿舍ID
     * @return 返回结果
     */
    public int deleteDormitoryManageById(Long id);

    /**
     * 批量删除宿舍
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    public int deleteDormitoryManageByIds(String[] ids);

    /**
     * 新增字宿舍信息
     *
     * @param dormitoryManage 宿舍信息
     * @return 返回结果信息
     */
    public int insertDormitoryManage(DormitoryManage dormitoryManage);

    /**
     * 修改宿舍信息
     *
     * @param dormitoryManage 宿舍信息
     * @return 返回结果信息
     */
    public int updateDormitoryManage(DormitoryManage dormitoryManage);

}
