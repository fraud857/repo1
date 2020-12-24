package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Requisition;

/**
 * 申请单Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public interface RequisitionMapper 
{
    /**
     * 查询申请单
     * 
     * @param id 申请单ID
     * @return 申请单
     */
    public Requisition selectRequisitionById(Long id);

    /**
     * 查询申请单列表
     * 
     * @param requisition 申请单
     * @return 申请单集合
     */
    public List<Requisition> selectRequisitionList(Requisition requisition);

    /**
     * 新增申请单
     * 
     * @param requisition 申请单
     * @return 结果
     */
    public int insertRequisition(Requisition requisition);

    /**
     * 修改申请单
     * 
     * @param requisition 申请单
     * @return 结果
     */
    public int updateRequisition(Requisition requisition);

    /**
     * 删除申请单
     * 
     * @param id 申请单ID
     * @return 结果
     */
    public int deleteRequisitionById(Long id);

    /**
     * 批量删除申请单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRequisitionByIds(String[] ids);
}
