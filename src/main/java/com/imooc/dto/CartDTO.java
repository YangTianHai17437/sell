package com.imooc.dto;

import lombok.Data;

/*
 *@author： 秃头佬
 *时间： 2019年12月05日
 */
@Data
public class CartDTO {
    /**
     * 商品Id.
     */
    private String productId;

    /**
     * 数量.
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
