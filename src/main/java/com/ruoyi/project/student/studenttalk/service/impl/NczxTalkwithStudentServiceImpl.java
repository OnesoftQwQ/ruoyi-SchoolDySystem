package com.ruoyi.project.student.studenttalk.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.framework.aspectj.lang.annotation.DataScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.student.studenttalk.mapper.NczxTalkwithStudentMapper;
import com.ruoyi.project.student.studenttalk.domain.NczxTalkwithStudent;
import com.ruoyi.project.student.studenttalk.service.INczxTalkwithStudentService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 谈心谈话记录Service业务层处理
 * 
 * @author 阿卜
 * @date 2020-12-14
 */
@Service
public class NczxTalkwithStudentServiceImpl implements INczxTalkwithStudentService 
{
    @Autowired
    private NczxTalkwithStudentMapper nczxTalkwithStudentMapper;

    /**
     * 查询谈心谈话记录
     * 
     * @param itemId 谈心谈话记录ID
     * @return 谈心谈话记录
     */
    @Override
    public NczxTalkwithStudent selectNczxTalkwithStudentById(Integer itemId)
    {
        return nczxTalkwithStudentMapper.selectNczxTalkwithStudentById(itemId);
    }

    /**
     * 查询谈心谈话记录列表
     * 
     * @param nczxTalkwithStudent 谈心谈话记录
     * @return 谈心谈话记录
     */
    @Override
    //用户权限注解
    @DataScope(userAlias = "u")
    public List<NczxTalkwithStudent> selectNczxTalkwithStudentList(NczxTalkwithStudent nczxTalkwithStudent)
    {
        return nczxTalkwithStudentMapper.selectNczxTalkwithStudentList(nczxTalkwithStudent);
    }

    /**
     * 新增谈心谈话记录
     * 
     * @param nczxTalkwithStudent 谈心谈话记录
     * @return 结果
     */
    @Override
    public int insertNczxTalkwithStudent(NczxTalkwithStudent nczxTalkwithStudent)
    {
        String loginname =  ShiroUtils.getLoginName();
        nczxTalkwithStudent.setCreateTime(DateUtils.getNowDate());
        nczxTalkwithStudent.setCreateBy(loginname);
        return nczxTalkwithStudentMapper.insertNczxTalkwithStudent(nczxTalkwithStudent);
    }

    /**
     * 修改谈心谈话记录
     * 
     * @param nczxTalkwithStudent 谈心谈话记录
     * @return 结果
     */
    @Override
    public int updateNczxTalkwithStudent(NczxTalkwithStudent nczxTalkwithStudent)
    {
        String loginname =  ShiroUtils.getLoginName();
        nczxTalkwithStudent.setUpdateTime(DateUtils.getNowDate());
        nczxTalkwithStudent.setCreateBy(loginname);
        return nczxTalkwithStudentMapper.updateNczxTalkwithStudent(nczxTalkwithStudent);
    }

    /**
     * 删除谈心谈话记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNczxTalkwithStudentByIds(String ids)
    {
        return nczxTalkwithStudentMapper.deleteNczxTalkwithStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除谈心谈话记录信息
     * 
     * @param itemId 谈心谈话记录ID
     * @return 结果
     */
    @Override
    public int deleteNczxTalkwithStudentById(Integer itemId)
    {
        return nczxTalkwithStudentMapper.deleteNczxTalkwithStudentById(itemId);
    }
}
