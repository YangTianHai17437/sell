package com.imooc.utils;
/*
 *@author： 秃头佬
 *时间： 2019年12月09日
 */

import com.imooc.enums.CodeEnum;

public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }

        }
        return null;
    }
}
