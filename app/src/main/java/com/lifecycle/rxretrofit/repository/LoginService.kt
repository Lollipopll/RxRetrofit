package com.lifecycle.rxretrofit.repository

import com.lifecycle.rxretrofit.moeld.LoginBean
import com.lifecycle.rxretrofit.net.model.ResponseWrapper
import io.reactivex.Observable

interface LoginService {
    fun getList(): Observable<ResponseWrapper<List<LoginBean.DataBean>>>
}