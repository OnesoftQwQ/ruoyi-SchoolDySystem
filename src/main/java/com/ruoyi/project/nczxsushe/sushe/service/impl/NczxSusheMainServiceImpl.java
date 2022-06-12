package com.ruoyi.project.nczxsushe.sushe.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.project.nczxsushe.sushe.domain.NczxSusheSub;
import com.ruoyi.project.nczxsushe.sushe.mapper.NczxSusheMainMapper;
import com.ruoyi.project.nczxsushe.sushe.domain.NczxSusheMain;
import com.ruoyi.project.nczxsushe.sushe.service.INczxSusheMainService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 宿舍检查Service业务层处理
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
@Service
public class NczxSusheMainServiceImpl implements INczxSusheMainService 
{
    @Autowired
    private NczxSusheMainMapper nczxSusheMainMapper;

    /**
     * 查询宿舍检查
     * 
     * @param id 宿舍检查ID
     * @return 宿舍检查
     */
    @Override
    public NczxSusheMain selectNczxSusheMainById(Long id)
    {
        return nczxSusheMainMapper.selectNczxSusheMainById(id);
    }

    /**
     * 查询宿舍检查列表
     * 
     * @param nczxSusheMain 宿舍检查
     * @return 宿舍检查
     */
    @Override
    public List<NczxSusheMain> selectNczxSusheMainList(NczxSusheMain nczxSusheMain)
    {
        return nczxSusheMainMapper.selectNczxSusheMainList(nczxSusheMain);
    }

    /**
     * 新增宿舍检查
     * 
     * @param nczxSusheMain 宿舍检查
     * @return 结果
     */
    @Transactional
    @Override
    public int insertNczxSusheMain(NczxSusheMain nczxSusheMain)
    {
        nczxSusheMain.setCreateTime(DateUtils.getNowDate());
        int rows = nczxSusheMainMapper.insertNczxSusheMain(nczxSusheMain);
        insertNczxSusheSub(nczxSusheMain);
        return rows;
    }

    /**
     * 修改宿舍检查
     * 
     * @param nczxSusheMain 宿舍检查
     * @return 结果
     */
    @Transactional
    @Override
    public int updateNczxSusheMain(NczxSusheMain nczxSusheMain)
    {
        nczxSusheMain.setUpdateTime(DateUtils.getNowDate());
        nczxSusheMainMapper.deleteNczxSusheSubByPid(nczxSusheMain.getId());
        insertNczxSusheSub(nczxSusheMain);
        return nczxSusheMainMapper.updateNczxSusheMain(nczxSusheMain);
    }

    /**
     * 删除宿舍检查对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteNczxSusheMainByIds(String ids)
    {
        nczxSusheMainMapper.deleteNczxSusheSubByPids(Convert.toStrArray(ids));
        return nczxSusheMainMapper.deleteNczxSusheMainByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除宿舍检查信息
     * 
     * @param id 宿舍检查ID
     * @return 结果
     */
    @Override
    public int deleteNczxSusheMainById(Long id)
    {
        nczxSusheMainMapper.deleteNczxSusheSubByPid(id);
        return nczxSusheMainMapper.deleteNczxSusheMainById(id);
    }

    /**
     * 新增宿舍检查明细信息
     * 
     * @param nczxSusheMain 宿舍检查对象
     */
    public void insertNczxSusheSub(NczxSusheMain nczxSusheMain)
    {
        List<NczxSusheSub> nczxSusheSubList = nczxSusheMain.getNczxSusheSubList();
        Long id = nczxSusheMain.getId();
        if (StringUtils.isNotNull(nczxSusheSubList))
        {
            List<NczxSusheSub> list = new ArrayList<NczxSusheSub>();
            for (NczxSusheSub nczxSusheSub : nczxSusheSubList)
            {
                nczxSusheSub.setPid(id);
                list.add(nczxSusheSub);
            }
            if (list.size() > 0)
            {
                nczxSusheMainMapper.batchNczxSusheSub(list);
            }
        }
    }
}
