package com.ruoyi.project.nczxxj.seedoctorrecord.mapper;

import java.util.List;
import com.ruoyi.project.nczxxj.seedoctorrecord.domain.StuseeDoctorrecord;

/**
 * 看病记录Mapper接口
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
public interface StuseeDoctorrecordMapper 
{
    /**
     * 查询看病记录
     * 
     * @param id 看病记录ID
     * @return 看病记录
     */
    public StuseeDoctorrecord selectStuseeDoctorrecordById(Long id);

    /**
     * 查询看病记录列表
     * 
     * @param stuseeDoctorrecord 看病记录
     * @return 看病记录集合
     */
    public List<StuseeDoctorrecord> selectStuseeDoctorrecordList(StuseeDoctorrecord stuseeDoctorrecord);

    /**
     * 新增看病记录
     * 
     * @param stuseeDoctorrecord 看病记录
     * @return 结果
     */
    public int insertStuseeDoctorrecord(StuseeDoctorrecord stuseeDoctorrecord);

    /**
     * 修改看病记录
     * 
     * @param stuseeDoctorrecord 看病记录
     * @return 结果
     */
    public int updateStuseeDoctorrecord(StuseeDoctorrecord stuseeDoctorrecord);

    /**
     * 删除看病记录
     * 
     * @param id 看病记录ID
     * @return 结果
     */
    public int deleteStuseeDoctorrecordById(Long id);

    /**
     * 批量删除看病记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStuseeDoctorrecordByIds(String[] ids);
}
