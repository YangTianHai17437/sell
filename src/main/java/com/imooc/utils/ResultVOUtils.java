package com.imooc.utils;
/*
 *@author： 秃头佬
 *时间： 2019年12月04日
 */

import com.imooc.VO.ResultVO;

public class ResultVOUtils {
    /*成功的時候*/
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setDate(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
    /*什么都不做的时候*/
    public static ResultVO success(){
        return success(null);
    }
    /*失败的时候*/
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
