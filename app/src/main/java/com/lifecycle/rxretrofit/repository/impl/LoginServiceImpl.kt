package com.lifecycle.rxretrofit.repository.impl

import com.lifecycle.rxretrofit.api.LoginApi
import com.lifecycle.rxretrofit.moeld.LoginBean
import com.lifecycle.rxretrofit.net.RetrofitManager
import com.lifecycle.rxretrofit.net.model.ResponseWrapper
import com.lifecycle.rxretrofit.net.rxutils.SchedulerUtils
import com.lifecycle.rxretrofit.repository.LoginService
import io.reactivex.Observable

class LoginServiceImpl : LoginService {
    override fun getList(): Observable<ResponseWrapper<List<LoginBean.DataBean>>> {
        return RetrofitManager.instance.create(LoginApi::class.java).requestLogin()
                .compose(SchedulerUtils.ioToMain())
    }
}