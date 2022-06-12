package com.ruoyi.project.nczxsushe.dormitory.controller;

import java.util.List;
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
import com.ruoyi.project.nczxsushe.dormitory.domain.DormitoryStumanage;
import com.ruoyi.project.nczxsushe.dormitory.service.IDormitoryStumanageService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 住宿生信息Controller
 * 
 * @author 阿卜
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/nczxsushe/dormitory/student")
public class DormitoryStumanageController extends BaseController
{
    private String prefix = "nczxsushe/dormitory/student";

    @Autowired
    private IDormitoryStumanageService dormitoryStumanageService;

    @RequiresPermissions("nczxsushe:dormitory:view")
    @GetMapping()
    public String dormitory()
    {
        return prefix + "/dormitory/student";
    }

    /**
     * 查询住宿生信息列表
     */
    @RequiresPermissions("nczxsushe:dormitory:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DormitoryStumanage dormitoryStumanage)
    {
        startPage();
        List<DormitoryStumanage> list = dormitoryStumanageService.selectDormitoryStumanageList(dormitoryStumanage);
        return getDataTable(list);
    }

    /**
     * 导出住宿生信息列表
     */
    @RequiresPermissions("nczxsushe:dormitory:export")
    @Log(title = "住宿生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DormitoryStumanage dormitoryStumanage)
    {
        List<DormitoryStumanage> list = dormitoryStumanageService.selectDormitoryStumanageList(dormitoryStumanage);
        ExcelUtil<DormitoryStumanage> util = new ExcelUtil<DormitoryStumanage>(DormitoryStumanage.class);
        return util.exportExcel(list, "dormitory/student");
    }

    /**
     * 新增住宿生信息
     */
    @GetMapping("/add/{dormitoryNum}")
    public String add(@PathVariable("dormitoryNum") String dormitoryNum,ModelMap mmap)
    {
        mmap.put("dormitoryNum",dormitoryNum);
        System.out.println(dormitoryNum);
        return prefix + "/add";
    }

    /**
     * 新增保存住宿生信息
     */
    @RequiresPermissions("nczxsushe:dormitory:add")
    @Log(title = "住宿生信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DormitoryStumanage dormitoryStumanage)
    {
        return toAjax(dormitoryStumanageService.insertDormitoryStumanage(dormitoryStumanage));
    }

    /**
     * 修改住宿生信息
     */
    @GetMapping("/edit/{sid}")
    public String edit(@PathVariable("sid") Long sid, ModelMap mmap)
    {
        DormitoryStumanage dormitoryStumanage = dormitoryStumanageService.selectDormitoryStumanageById(sid);
        mmap.put("dormitoryStumanage", dormitoryStumanage);
        return prefix + "/edit";
    }

    /**
     * 修改保存住宿生信息
     */
    @RequiresPermissions("nczxsushe:dormitory:edit")
    @Log(title = "住宿生信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DormitoryStumanage dormitoryStumanage)
    {
        return toAjax(dormitoryStumanageService.updateDormitoryStumanage(dormitoryStumanage));
    }

    /**
     * 删除住宿生信息
     */
    @RequiresPermissions("nczxsushe:dormitory:remove")
    @Log(title = "住宿生信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dormitoryStumanageService.deleteDormitoryStumanageByIds(ids));
    }
    /**
     * 查看住校生详信息
     * @param id
     * @param mmap
     * @return
     */
    @RequiresPermissions("nczxsushe:dormitory:detail")
    @Log(title = "谈心谈话记录详情", businessType = BusinessType.OTHER)
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        mmap.put("dormitorystuinfo", dormitoryStumanageService.selectDormitoryStumanageById(id));
        System.out.println(dormitoryStumanageService.selectDormitoryStumanageById(id));
        return prefix + "/detail";
    }
}
