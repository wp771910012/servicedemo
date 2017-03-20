package com.wp.webdemo.resp;

/**
 * Created by 95 on 2017/3/17.
 */
public  class ResultEnum {
    private static final String SUCCESS="1";
    private static final String AUTHNOTALLOW="100";
    private static final String PARAMNOTEXIST="200";


    public static ResultResponse success() {
        return new ResultResponse(SUCCESS, "成功");
    }

    public static ResultResponse authNotAllow(String resultMessage){
        return new ResultResponse(AUTHNOTALLOW, resultMessage);
    }
    public static ResultResponse paramNotExist(String param){
        return new ResultResponse(PARAMNOTEXIST, param+"不存在");
    }
}
