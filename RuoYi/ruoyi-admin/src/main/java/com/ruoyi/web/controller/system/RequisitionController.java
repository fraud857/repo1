package com.ruoyi.web.controller.system;

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
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Requisition;
import com.ruoyi.system.service.IRequisitionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;

/**
 * 申请单Controller
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
@Controller
@RequestMapping("/system/requisition")
public class RequisitionController extends BaseController
{
    private String prefix = "system/requisition";

    @Autowired
    private IRequisitionService requisitionService;

    @RequiresPermissions("system:requisition:view")
    @GetMapping()
    public String requisition()
    {
        return prefix + "/requisition";
    }

    /**
     * 查询申请单列表
     */
    @RequiresPermissions("system:requisition:list")
    @PostMapping("/list")
    @ResponseBody
    public List<Requisition> list(Requisition requisition)
    {
        startPage();
        List<Requisition> list = requisitionService.selectRequisitionList(requisition);
        return list;
    }


    /**
     * 新增申请单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存申请单
     */
    @RequiresPermissions("system:requisition:add")

    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Requisition requisition)
    {
        return toAjax(requisitionService.insertRequisition(requisition));
    }

    /**
     * 修改申请单
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Requisition requisition = requisitionService.selectRequisitionById(id);
        mmap.put("requisition", requisition);
        return prefix + "/edit";
    }

    /**
     * 修改保存申请单
     */
    @RequiresPermissions("system:requisition:edit")
    @Log(title = "申请单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Requisition requisition)
    {
        return toAjax(requisitionService.updateRequisition(requisition));
    }

    /**
     * 删除申请单
     */
    @RequiresPermissions("system:requisition:remove")
    @Log(title = "申请单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(requisitionService.deleteRequisitionByIds(ids));
    }
}
