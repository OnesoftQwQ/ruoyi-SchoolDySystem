package com.ruoyi.project.nczxsushe.sushe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import com.ruoyi.project.nczxsushe.sushe.domain.NczxSusheMain;
import com.ruoyi.project.nczxsushe.sushe.service.INczxSusheMainService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 宿舍检查Controller
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/nczxsushe/sushe")
public class NczxSusheMainController extends BaseController
{
    private String prefix = "nczxsushe/sushe";

    @Autowired
    private INczxSusheMainService nczxSusheMainService;

    @RequiresPermissions("nczxsushe:sushe:view")
    @GetMapping()
    public String sushe()
    {
        return prefix + "/sushe";
    }

    /**
     * 查询宿舍检查列表
     */
    @RequiresPermissions("nczxsushe:sushe:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NczxSusheMain nczxSusheMain)
    {
        startPage();
        List<NczxSusheMain> list = nczxSusheMainService.selectNczxSusheMainList(nczxSusheMain);
        return getDataTable(list);
    }

    /**
     * 导出宿舍检查列表
     */
    @RequiresPermissions("nczxsushe:sushe:export")
    @Log(title = "宿舍检查", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NczxSusheMain nczxSusheMain)
    {
        List<NczxSusheMain> list = nczxSusheMainService.selectNczxSusheMainList(nczxSusheMain);
        ExcelUtil<NczxSusheMain> util = new ExcelUtil<NczxSusheMain>(NczxSusheMain.class);
        return util.exportExcel(list, "sushe");
    }

    /**
     * 新增宿舍检查
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存宿舍检查
     */
    @RequiresPermissions("nczxsushe:sushe:add")
    @Log(title = "宿舍检查", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NczxSusheMain nczxSusheMain)
    {
        return toAjax(nczxSusheMainService.insertNczxSusheMain(nczxSusheMain));
    }

    /**
     * 修改宿舍检查
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NczxSusheMain nczxSusheMain = nczxSusheMainService.selectNczxSusheMainById(id);
        mmap.put("nczxSusheMain", nczxSusheMain);
        return prefix + "/edit";
    }

    /**
     * 修改保存宿舍检查
     */
    @RequiresPermissions("nczxsushe:sushe:edit")
    @Log(title = "宿舍检查", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NczxSusheMain nczxSusheMain)
    {
        return toAjax(nczxSusheMainService.updateNczxSusheMain(nczxSusheMain));
    }

    /**
     * 删除宿舍检查
     */
    @RequiresPermissions("nczxsushe:sushe:remove")
    @Log(title = "宿舍检查", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nczxSusheMainService.deleteNczxSusheMainByIds(ids));
    }

    /**
     *宿舍检查记录详情
     * @param id
     * @param mmap
     * @return
     */
    @RequiresPermissions("nczxsushe:sushe:detail")
    @Log(title = "宿舍检查记录详情", businessType = BusinessType.OTHER)
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        NczxSusheMain nczxSusheMain = nczxSusheMainService.selectNczxSusheMainById(id);
        mmap.put("nczxSusheMain", nczxSusheMain);
        System.out.println(nczxSusheMain);
        return prefix + "/detail";
    }
}
