package com.imooc.enums;

import lombok.Getter;

/*
 *@author： 秃头佬
 *时间： 2019年12月04日
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),

    ;
    private Integer code;
    private  String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
