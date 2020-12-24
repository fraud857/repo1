package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RequisitionMapper;
import com.ruoyi.system.domain.Requisition;
import com.ruoyi.system.service.IRequisitionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 申请单Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
@Service
public class RequisitionServiceImpl implements IRequisitionService 
{
    @Autowired
    private RequisitionMapper requisitionMapper;

    /**
     * 查询申请单
     * 
     * @param id 申请单ID
     * @return 申请单
     */
    @Override
    public Requisition selectRequisitionById(Long id)
    {
        return requisitionMapper.selectRequisitionById(id);
    }

    /**
     * 查询申请单列表
     * 
     * @param requisition 申请单
     * @return 申请单
     */
    @Override
    public List<Requisition> selectRequisitionList(Requisition requisition)
    {
        return requisitionMapper.selectRequisitionList(requisition);
    }

    /**
     * 新增申请单
     * 
     * @param requisition 申请单
     * @return 结果
     */
    @Override
    public int insertRequisition(Requisition requisition)
    {
        return requisitionMapper.insertRequisition(requisition);
    }

    /**
     * 修改申请单
     * 
     * @param requisition 申请单
     * @return 结果
     */
    @Override
    public int updateRequisition(Requisition requisition)
    {
        return requisitionMapper.updateRequisition(requisition);
    }

    /**
     * 删除申请单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRequisitionByIds(String ids)
    {
        return requisitionMapper.deleteRequisitionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除申请单信息
     * 
     * @param id 申请单ID
     * @return 结果
     */
    @Override
    public int deleteRequisitionById(Long id)
    {
        return requisitionMapper.deleteRequisitionById(id);
    }
}
