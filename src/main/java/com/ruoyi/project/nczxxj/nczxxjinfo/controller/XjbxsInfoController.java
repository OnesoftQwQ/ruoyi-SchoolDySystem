package com.ruoyi.project.nczxxj.nczxxjinfo.controller;

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
import com.ruoyi.project.nczxxj.nczxxjinfo.domain.XjbxsInfo;
import com.ruoyi.project.nczxxj.nczxxjinfo.service.IXjbxsInfoService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 学生信息Controller
 * 
 * @author 阿卜
 * @date 2021-01-05
 */
@Controller
@RequestMapping("/nczxxjinfo/nczxxjinfo")
public class XjbxsInfoController extends BaseController
{
    private String prefix = "nczxxjinfo/nczxxjinfo";

    @Autowired
    private IXjbxsInfoService xjbxsInfoService;

    @RequiresPermissions("nczxxjinfo:nczxxjinfo:view")
    @GetMapping()
    public String nczxxjinfo()
    {
        return prefix + "/nczxxjinfo";
    }

    /**
     * 查询学生信息列表
     */
    @RequiresPermissions("nczxxjinfo:nczxxjinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(XjbxsInfo xjbxsInfo)
    {
        startPage();
        List<XjbxsInfo> list = xjbxsInfoService.selectXjbxsInfoList(xjbxsInfo);
        return getDataTable(list);
    }

    /**
     * 导出学生信息列表
     */
    @RequiresPermissions("nczxxjinfo:nczxxjinfo:export")
    @Log(title = "学生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(XjbxsInfo xjbxsInfo)
    {
        List<XjbxsInfo> list = xjbxsInfoService.selectXjbxsInfoList(xjbxsInfo);
        ExcelUtil<XjbxsInfo> util = new ExcelUtil<XjbxsInfo>(XjbxsInfo.class);
        return util.exportExcel(list, "nczxxjinfo");
    }

    /**
     * 新增学生信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生信息
     */
    @RequiresPermissions("nczxxjinfo:nczxxjinfo:add")
    @Log(title = "学生信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(XjbxsInfo xjbxsInfo)
    {
        return toAjax(xjbxsInfoService.insertXjbxsInfo(xjbxsInfo));
    }

    /**
     * 修改学生信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        XjbxsInfo xjbxsInfo = xjbxsInfoService.selectXjbxsInfoById(id);
        mmap.put("xjbxsInfo", xjbxsInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生信息
     */
    @RequiresPermissions("nczxxjinfo:nczxxjinfo:edit")
    @Log(title = "学生信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(XjbxsInfo xjbxsInfo)
    {
        return toAjax(xjbxsInfoService.updateXjbxsInfo(xjbxsInfo));
    }

    /**
     * 删除学生信息
     */
    @RequiresPermissions("nczxxjinfo:nczxxjinfo:remove")
    @Log(title = "学生信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(xjbxsInfoService.deleteXjbxsInfoByIds(ids));
    }
    /**
     *学生信息详情
     * @param id
     * @param mmap
     * @return
     */
    @RequiresPermissions("nczxxjinfo:nczxxjinfo:detail")
    @Log(title = "学生信息详情", businessType = BusinessType.OTHER)
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        XjbxsInfo ngbstuinfo = xjbxsInfoService.selectXjbxsInfoById(id);
        mmap.put("ngbstuinfo", ngbstuinfo);
        System.out.println(ngbstuinfo);
        return prefix + "/detail";
    }
}
