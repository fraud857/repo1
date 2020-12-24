package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DepartmentMapper;
import com.ruoyi.system.domain.Department;
import com.ruoyi.system.service.IDepartmentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 部门Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService 
{
    @Autowired
    private DepartmentMapper departmentMapper;
/*
    *//**
     * 查询部门
     * 
     * @param id 部门ID
     * @return 部门
     *//*
    @Override
    public Department selectDepartmentById(Long id)
    {
        return departmentMapper.selectDepartmentById(id);
    }

  */  /**
     * 查询部门列表
     * 
     * @param department 部门
     * @return 部门
     */
    @Override
    public List<Department> selectDepartmentList(Department department)
    {
        return departmentMapper.selectDepartmentList(department);
    }

  /*  *//**
     * 新增部门
     * 
     * @param department 部门
     * @return 结果
     *//*
    @Override
    public int insertDepartment(Department department)
    {
        return departmentMapper.insertDepartment(department);
    }

    *//**
     * 修改部门
     * 
     * @param department 部门
     * @return 结果
     *//*
    @Override
    public int updateDepartment(Department department)
    {
        return departmentMapper.updateDepartment(department);
    }

    *//**
     * 删除部门对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     *//*
    @Override
    public int deleteDepartmentByIds(String ids)
    {
        return departmentMapper.deleteDepartmentByIds(Convert.toStrArray(ids));
    }

    *//**
     * 删除部门信息
     * 
     * @param id 部门ID
     * @return 结果
     *//*
    @Override
    public int deleteDepartmentById(Long id)
    {
        return departmentMapper.deleteDepartmentById(id);
    }*/
}
