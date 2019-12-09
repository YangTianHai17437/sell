package com.imooc.enums;

import lombok.Getter;

/*
 *@author： 秃头佬
 *时间： 2019年12月04日
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "正常"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
