package com.ruoyi.project.student.studenttalk.mapper;

import java.util.List;
import com.ruoyi.project.student.studenttalk.domain.NczxTalkwithStudent;

/**
 * 谈心谈话记录Mapper接口
 * 
 * @author 阿卜
 * @date 2020-12-14
 */
public interface NczxTalkwithStudentMapper 
{
    /**
     * 查询谈心谈话记录
     * 
     * @param itemId 谈心谈话记录ID
     * @return 谈心谈话记录
     */
    public NczxTalkwithStudent selectNczxTalkwithStudentById(Integer itemId);

    /**
     * 查询谈心谈话记录列表
     * 
     * @param nczxTalkwithStudent 谈心谈话记录
     * @return 谈心谈话记录集合
     */
    public List<NczxTalkwithStudent> selectNczxTalkwithStudentList(NczxTalkwithStudent nczxTalkwithStudent);

    /**
     * 新增谈心谈话记录
     * 
     * @param nczxTalkwithStudent 谈心谈话记录
     * @return 结果
     */
    public int insertNczxTalkwithStudent(NczxTalkwithStudent nczxTalkwithStudent);

    /**
     * 修改谈心谈话记录
     * 
     * @param nczxTalkwithStudent 谈心谈话记录
     * @return 结果
     */
    public int updateNczxTalkwithStudent(NczxTalkwithStudent nczxTalkwithStudent);

    /**
     * 删除谈心谈话记录
     * 
     * @param itemId 谈心谈话记录ID
     * @return 结果
     */
    public int deleteNczxTalkwithStudentById(Integer itemId);

    /**
     * 批量删除谈心谈话记录
     * 
     * @param itemIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteNczxTalkwithStudentByIds(String[] itemIds);
}
