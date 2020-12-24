package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Department;

/**
 * 部门Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public interface DepartmentMapper 
{/*
    *//**
     * 查询部门
     * 
     * @param id 部门ID
     * @return 部门
     *//*
    public Department selectDepartmentById(Long id);
*/
    /**
     * 查询部门列表
     *
     * @param department 部门
     * @return 部门集合
     */
    public List<Department> selectDepartmentList(Department department);

   /* *//**
     * 新增部门
     * 
     * @param department 部门
     * @return 结果
     *//*
    public int insertDepartment(Department department);

    *//**
     * 修改部门
     * 
     * @param department 部门
     * @return 结果
     *//*
    public int updateDepartment(Department department);

    *//**
     * 删除部门
     * 
     * @param id 部门ID
     * @return 结果
     *//*
    public int deleteDepartmentById(Long id);

    *//**
     * 批量删除部门
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     *//*
    public int deleteDepartmentByIds(String[] ids);*/
}
