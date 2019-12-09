package com.imooc.VO;

import lombok.Data;

/*Http请求
 *@author： 秃头佬
 *时间： 2019年12月04日
 */
@Data
public class ResultVO<T> {
    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体内容*/
    private T date;
}
