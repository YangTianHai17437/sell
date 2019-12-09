package com.imooc.exception;
/*
 *@author： 秃头佬
 *时间： 2019年12月05日
 */

import com.imooc.enums.ResultEnum;

public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMassage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }


}
