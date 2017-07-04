/*
 * 文 件 名:  CargoInfo.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 27, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.domain;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 27, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class CargoInfo
{
    
    private String goodsType;
    
    private String piece;
    
    private String weight;
   
    public String getGoodsType()
    {
        return goodsType;
    }
    
    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
    }
    
    public String getPiece()
    {
        return piece;
    }
    
    public void setPiece(String piece)
    {
        this.piece = piece;
    }
    
    public String getWeight()
    {
        return weight;
    }
    
    public void setWeight(String weight)
    {
        this.weight = weight;
    }
    
}
