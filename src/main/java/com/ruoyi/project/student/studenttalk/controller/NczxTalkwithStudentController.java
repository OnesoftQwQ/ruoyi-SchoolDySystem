package com.ruoyi.project.student.studenttalk.controller;

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
import com.ruoyi.project.student.studenttalk.domain.NczxTalkwithStudent;
import com.ruoyi.project.student.studenttalk.service.INczxTalkwithStudentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 谈心谈话记录Controller
 *
 * @author 阿卜
 * @date 2020-12-16
 */
@Controller
@RequestMapping("/student/studenttalk")
public class NczxTalkwithStudentController extends BaseController
{
    private String prefix = "student/studenttalk";

    @Autowired
    private INczxTalkwithStudentService nczxTalkwithStudentService;

    @RequiresPermissions("student:studenttalk:view")
    @GetMapping()
    public String studenttalk()
    {
        return prefix + "/studenttalk";
    }

    /**
     * 查询谈心谈话记录列表
     */
    @RequiresPermissions("student:studenttalk:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NczxTalkwithStudent nczxTalkwithStudent)
    {
        startPage();
        List<NczxTalkwithStudent> list = nczxTalkwithStudentService.selectNczxTalkwithStudentList(nczxTalkwithStudent);
        return getDataTable(list);
    }

    /**
     * 导出谈心谈话记录列表
     */
    @RequiresPermissions("student:studenttalk:export")
    @Log(title = "谈心谈话记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NczxTalkwithStudent nczxTalkwithStudent)
    {
        List<NczxTalkwithStudent> list = nczxTalkwithStudentService.selectNczxTalkwithStudentList(nczxTalkwithStudent);
        ExcelUtil<NczxTalkwithStudent> util = new ExcelUtil<NczxTalkwithStudent>(NczxTalkwithStudent.class);
        return util.exportExcel(list, "studenttalk");
    }

    /**
     * 新增谈心谈话记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存谈心谈话记录
     */
    @RequiresPermissions("student:studenttalk:add")
    @Log(title = "谈心谈话记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NczxTalkwithStudent nczxTalkwithStudent)
    {

        return toAjax(nczxTalkwithStudentService.insertNczxTalkwithStudent(nczxTalkwithStudent));
    }

    /**
     * 修改谈心谈话记录
     */
    @GetMapping("/edit/{itemId}")
    public String edit(@PathVariable("itemId") Integer itemId, ModelMap mmap)
    {
        NczxTalkwithStudent nczxTalkwithStudent = nczxTalkwithStudentService.selectNczxTalkwithStudentById(itemId);
        mmap.put("nczxTalkwithStudent", nczxTalkwithStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存谈心谈话记录
     */
    @RequiresPermissions("student:studenttalk:edit")
    @Log(title = "谈心谈话记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NczxTalkwithStudent nczxTalkwithStudent)
    {
        return toAjax(nczxTalkwithStudentService.updateNczxTalkwithStudent(nczxTalkwithStudent));
    }

    /**
     * 删除谈心谈话记录
     */
    @RequiresPermissions("student:studenttalk:remove")
    @Log(title = "谈心谈话记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(nczxTalkwithStudentService.deleteNczxTalkwithStudentByIds(ids));
    }

    /**
     * 查看详信息
     * @param itemId
     * @param mmap
     * @return
     */
    @RequiresPermissions("student:studenttalk:detail")
    @Log(title = "谈心谈话记录详情", businessType = BusinessType.OTHER)
    @GetMapping("/detail/{itemId}")
    public String detail(@PathVariable("itemId") Integer itemId, ModelMap mmap)
    {
        mmap.put("studenttalk", nczxTalkwithStudentService.selectNczxTalkwithStudentById(itemId));
        return prefix + "/detail";
    }
}