package com.ruoyi.project.nczxxj.seedoctorrecord.controller;

import java.util.List;

import com.ruoyi.project.nczxxj.nczxxjinfo.domain.XjbxsInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.nczxxj.seedoctorrecord.domain.StuseeDoctorrecord;
import com.ruoyi.project.nczxxj.seedoctorrecord.service.IStuseeDoctorrecordService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 看病记录Controller
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
@Controller
@RequestMapping("/nczxxjinfo/seedoctorrecord")
public class StuseeDoctorrecordController extends BaseController
{
    private String prefix = "nczxxjinfo/seedoctorrecord";

    @Autowired
    private IStuseeDoctorrecordService stuseeDoctorrecordService;

    @RequiresPermissions("nczxxjinfo:seedoctorrecord:view")
    @GetMapping()
    public String seedoctorrecord()
    {
        return prefix + "/seedoctorrecord";
    }

    /**
     * 查询看病记录列表
     */
    @RequiresPermissions("nczxxjinfo:seedoctorrecord:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StuseeDoctorrecord stuseeDoctorrecord)
    {
        startPage();
        List<StuseeDoctorrecord> list = stuseeDoctorrecordService.selectStuseeDoctorrecordList(stuseeDoctorrecord);
        return getDataTable(list);
    }

    /**
     * 导出看病记录列表
     */
    @RequiresPermissions("nczxxjinfo:seedoctorrecord:export")
    @Log(title = "看病记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StuseeDoctorrecord stuseeDoctorrecord)
    {
        List<StuseeDoctorrecord> list = stuseeDoctorrecordService.selectStuseeDoctorrecordList(stuseeDoctorrecord);
        ExcelUtil<StuseeDoctorrecord> util = new ExcelUtil<StuseeDoctorrecord>(StuseeDoctorrecord.class);
        return util.exportExcel(list, "seedoctorrecord");
    }

    /**
     * 新增看病记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存看病记录
     */
    @RequiresPermissions("nczxxjinfo:seedoctorrecord:add")
    @Log(title = "看病记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StuseeDoctorrecord stuseeDoctorrecord)
    {
        return toAjax(stuseeDoctorrecordService.insertStuseeDoctorrecord(stuseeDoctorrecord));
    }

    /**
     * 修改看病记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        StuseeDoctorrecord stuseeDoctorrecord = stuseeDoctorrecordService.selectStuseeDoctorrecordById(id);
        mmap.put("stuseeDoctorrecord", stuseeDoctorrecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存看病记录
     */
    @RequiresPermissions("nczxxjinfo:seedoctorrecord:edit")
    @Log(title = "看病记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StuseeDoctorrecord stuseeDoctorrecord)
    {
        return toAjax(stuseeDoctorrecordService.updateStuseeDoctorrecord(stuseeDoctorrecord));
    }

    /**
     * 删除看病记录
     */
    @RequiresPermissions("nczxxjinfo:seedoctorrecord:remove")
    @Log(title = "看病记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stuseeDoctorrecordService.deleteStuseeDoctorrecordByIds(ids));
    }

    /**
     *学看病记录信息详情
     * @param id
     * @param mmap
     * @return
     */
    @RequiresPermissions("nczxxjinfo:seedoctorrecord:detail")
    @Log(title = "学看病记录信息详情", businessType = BusinessType.OTHER)
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        StuseeDoctorrecord seedoctorinfo = stuseeDoctorrecordService.selectStuseeDoctorrecordById(id);
        mmap.put("seedoctorinfo", seedoctorinfo);
        System.out.println(seedoctorinfo);
        return prefix + "/detail";
    }
}
