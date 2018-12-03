package com.lifecycle.rxretrofit.api


import com.lifecycle.rxretrofit.moeld.LoginBean
import com.lifecycle.rxretrofit.net.model.ResponseWrapper
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * @author lifeCyc
 * @date 2018/11/30
 * @describe api服务
 */
interface LoginApi {

    /**
     * 登录
     */
    @GET("banner/json")
    fun requestLogin(): Observable<ResponseWrapper<List<LoginBean.DataBean>>>

}