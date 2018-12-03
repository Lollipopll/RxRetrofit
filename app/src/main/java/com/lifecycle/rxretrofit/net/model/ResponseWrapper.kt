package com.lifecycle.rxretrofit.net.model

/**
 *
 * @author wangzexin
 * @date 2018/1/25
 * @describe 通用的返回模型
 */
data class ResponseWrapper<T>(var data: T, var errorCode: Int, var errorMsg: String)