package com.ruoyi.project.nczxsushe.sushe.service;

import java.util.List;
import com.ruoyi.project.nczxsushe.sushe.domain.NczxSusheMain;

/**
 * 宿舍检查Service接口
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
public interface INczxSusheMainService 
{
    /**
     * 查询宿舍检查
     * 
     * @param id 宿舍检查ID
     * @return 宿舍检查
     */
    public NczxSusheMain selectNczxSusheMainById(Long id);

    /**
     * 查询宿舍检查列表
     * 
     * @param nczxSusheMain 宿舍检查
     * @return 宿舍检查集合
     */
    public List<NczxSusheMain> selectNczxSusheMainList(NczxSusheMain nczxSusheMain);

    /**
     * 新增宿舍检查
     * 
     * @param nczxSusheMain 宿舍检查
     * @return 结果
     */
    public int insertNczxSusheMain(NczxSusheMain nczxSusheMain);

    /**
     * 修改宿舍检查
     * 
     * @param nczxSusheMain 宿舍检查
     * @return 结果
     */
    public int updateNczxSusheMain(NczxSusheMain nczxSusheMain);

    /**
     * 批量删除宿舍检查
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNczxSusheMainByIds(String ids);

    /**
     * 删除宿舍检查信息
     * 
     * @param id 宿舍检查ID
     * @return 结果
     */
    public int deleteNczxSusheMainById(Long id);
}
