package com.lifecycle.rxretrofit.net.callback

/**
 *
 * @author wangzexin
 * @date 2018/1/26
 * @describe
 */
class ApiException//    public ApiException (int errorCode, String errorMessage)
//    {
//        super(errorMessage);
//        mErrorCode = errorCode;
//    }
(var code: String, msg: String) : RuntimeException(msg) {

    //    /**
//     * 判断是否是token失效
//     *
//     * @return 失效返回true, 否则返回false;
//     */
//    public boolean isTokenExpried()
//    {
//        return mErrorCode == Constants.TOKEN_EXPRIED;
//    }
}