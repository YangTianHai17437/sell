package com.imooc.service;
/*
 *卖家
 * @author： 秃头佬
 *时间： 2019年12月09日
 */

import com.imooc.dto.OrderDTO;

public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
