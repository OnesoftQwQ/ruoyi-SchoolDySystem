package com.ruoyi.project.nczxsushe.dormitory.controller;

import java.util.List;

import com.ruoyi.project.nczxsushe.sushe.domain.NczxSusheMain;
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
import com.ruoyi.project.nczxsushe.dormitory.domain.DormitoryManage;
import com.ruoyi.project.nczxsushe.dormitory.service.IDormitoryManageService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 宿舍Controller
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/nczxsushe/dormitory")
public class DormitoryManageController extends BaseController
{
    private String prefix = "nczxsushe/dormitory/dormitoryinfo";

    @Autowired
    private IDormitoryManageService dormitoryManageService;

    @RequiresPermissions("nczxsushe:dormitory:view")
    @GetMapping()
    public String dormitory()
    {
        return prefix + "/dormitoryinfo";
    }

    /**
     * 查询宿舍列表
     */
    @RequiresPermissions("nczxsushe:dormitory:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DormitoryManage dormitoryManage)
    {
        startPage();
        List<DormitoryManage> list = dormitoryManageService.selectDormitoryManageList(dormitoryManage);
        return getDataTable(list);
    }

    /**
     * 导出宿舍列表
     */
    @RequiresPermissions("nczxsushe:dormitory:export")
    @Log(title = "宿舍", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DormitoryManage dormitoryManage)
    {
        List<DormitoryManage> list = dormitoryManageService.selectDormitoryManageList(dormitoryManage);
        ExcelUtil<DormitoryManage> util = new ExcelUtil<DormitoryManage>(DormitoryManage.class);
        return util.exportExcel(list, "dormitory");
    }

    /**
     * 新增宿舍
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存宿舍
     */
    @RequiresPermissions("nczxsushe:dormitory:add")
    @Log(title = "宿舍", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DormitoryManage dormitoryManage)
    {
        return toAjax(dormitoryManageService.insertDormitoryManage(dormitoryManage));
    }

    /**
     * 修改宿舍
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DormitoryManage dormitoryManage = dormitoryManageService.selectDormitoryManageById(id);
        mmap.put("dormitoryManage", dormitoryManage);
        return prefix + "/edit";
    }

    /**
     * 修改保存宿舍
     */
    @RequiresPermissions("nczxsushe:dormitory:edit")
    @Log(title = "宿舍", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DormitoryManage dormitoryManage)
    {
        return toAjax(dormitoryManageService.updateDormitoryManage(dormitoryManage));
    }

    /**
     * 删除宿舍
     */
    @RequiresPermissions("nczxsushe:dormitory:remove")
    @Log(title = "宿舍", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dormitoryManageService.deleteDormitoryManageByIds(ids));
    }

    /**
     * 打开到住校生信息页面
     */
    @RequiresPermissions("nczxsushe:dormitory:list")
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        mmap.put("dormitory", dormitoryManageService.selectDormitoryManageById(id));
        mmap.put("dormitorylist", dormitoryManageService.selectDormitoryManageAll());
        return "/nczxsushe/dormitory/student/stumanage";
    }
    /**
     *住校生详情信息
     * @param id
     * @param mmap
     * @return
     */
    @RequiresPermissions("nczxsushe:dormitory:detail")
    @Log(title = "住校生详情信息", businessType = BusinessType.OTHER)
    @GetMapping("/stuinfo/{id}")
    public String stuinfo(@PathVariable("id") Long id, ModelMap mmap)
    {
        DormitoryManage dormitorystuinfo = dormitoryManageService.selectDormitoryManageInfoById(id);
        mmap.put("dormitorystuinfo", dormitorystuinfo);
        System.out.println(dormitorystuinfo);
        return prefix + "/stuinfo";
    }
}
