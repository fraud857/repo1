package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 申请单对象 requisition
 * 
 * @author ruoyi
 * @date 2020-12-06
 */
public class Requisition extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 采购物品名称 */

    private String name;

    /** 物品种类 */

    private String type;

    /** 采购物品单价 */

    private BigDecimal unitPrice;

    /** 采购物品数量 */

    private String quantity;

    /** 购物品总价 */

    private BigDecimal totalPrice;

    /** 采购物品时间 */

    private Date time;

    /** 采购人 */

    private String purchasePersons;

    /** 采购部门 */

    private String departments;

    /** 录入人 */

    private String entryPersons;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setUnitPrice(BigDecimal unitPrice) 
    {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() 
    {
        return unitPrice;
    }
    public void setQuantity(String quantity) 
    {
        this.quantity = quantity;
    }

    public String getQuantity() 
    {
        return quantity;
    }
    public void setTotalPrice(BigDecimal totalPrice) 
    {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() 
    {
        return totalPrice;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setPurchasePersons(String purchasePersons) 
    {
        this.purchasePersons = purchasePersons;
    }

    public String getPurchasePersons() 
    {
        return purchasePersons;
    }
    public void setDepartments(String departments) 
    {
        this.departments = departments;
    }

    public String getDepartments() 
    {
        return departments;
    }
    public void setEntryPersons(String entryPersons) 
    {
        this.entryPersons = entryPersons;
    }

    public String getEntryPersons() 
    {
        return entryPersons;
    }

    @Override
    public String toString() {
        return "Requisition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity='" + quantity + '\'' +
                ", totalPrice=" + totalPrice +
                ", time=" + time +
                ", purchasePersons='" + purchasePersons + '\'' +
                ", departments='" + departments + '\'' +
                ", entryPersons='" + entryPersons + '\'' +
                '}';
    }
}
