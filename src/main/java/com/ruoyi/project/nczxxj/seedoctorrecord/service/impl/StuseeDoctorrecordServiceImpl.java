package com.ruoyi.project.nczxxj.seedoctorrecord.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.nczxxj.seedoctorrecord.mapper.StuseeDoctorrecordMapper;
import com.ruoyi.project.nczxxj.seedoctorrecord.domain.StuseeDoctorrecord;
import com.ruoyi.project.nczxxj.seedoctorrecord.service.IStuseeDoctorrecordService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 看病记录Service业务层处理
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
@Service
public class StuseeDoctorrecordServiceImpl implements IStuseeDoctorrecordService 
{
    @Autowired
    private StuseeDoctorrecordMapper stuseeDoctorrecordMapper;

    /**
     * 查询看病记录
     * 
     * @param id 看病记录ID
     * @return 看病记录
     */
    @Override
    public StuseeDoctorrecord selectStuseeDoctorrecordById(Long id)
    {
        return stuseeDoctorrecordMapper.selectStuseeDoctorrecordById(id);
    }

    /**
     * 查询看病记录列表
     * 
     * @param stuseeDoctorrecord 看病记录
     * @return 看病记录
     */
    @Override
    public List<StuseeDoctorrecord> selectStuseeDoctorrecordList(StuseeDoctorrecord stuseeDoctorrecord)
    {
        return stuseeDoctorrecordMapper.selectStuseeDoctorrecordList(stuseeDoctorrecord);
    }

    /**
     * 新增看病记录
     * 
     * @param stuseeDoctorrecord 看病记录
     * @return 结果
     */
    @Override
    public int insertStuseeDoctorrecord(StuseeDoctorrecord stuseeDoctorrecord)
    {
        stuseeDoctorrecord.setCreateTime(DateUtils.getNowDate());
        stuseeDoctorrecord.setCreateBy(ShiroUtils.getLoginName());
        return stuseeDoctorrecordMapper.insertStuseeDoctorrecord(stuseeDoctorrecord);
    }

    /**
     * 修改看病记录
     * 
     * @param stuseeDoctorrecord 看病记录
     * @return 结果
     */
    @Override
    public int updateStuseeDoctorrecord(StuseeDoctorrecord stuseeDoctorrecord)
    {
        return stuseeDoctorrecordMapper.updateStuseeDoctorrecord(stuseeDoctorrecord);
    }

    /**
     * 删除看病记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStuseeDoctorrecordByIds(String ids)
    {
        return stuseeDoctorrecordMapper.deleteStuseeDoctorrecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除看病记录信息
     * 
     * @param id 看病记录ID
     * @return 结果
     */
    @Override
    public int deleteStuseeDoctorrecordById(Long id)
    {
        return stuseeDoctorrecordMapper.deleteStuseeDoctorrecordById(id);
    }
}
