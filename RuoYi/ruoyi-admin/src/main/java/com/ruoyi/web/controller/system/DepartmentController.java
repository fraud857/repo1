package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.system.domain.Department;
import com.ruoyi.system.service.IDepartmentService;
import com.ruoyi.common.core.controller.BaseController;

import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 部门Controller
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
@Controller
@RequestMapping("/system/department")
public class DepartmentController extends BaseController
{
    private String prefix = "system/department";

    @Autowired
    private IDepartmentService departmentService;

    /**
     * 查询部门列表
     */
    @RequiresPermissions("system:department:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Department department)
    {
        startPage();
        List<Department> list = departmentService.selectDepartmentList(department);
        return getDataTable(list);
    }

}
