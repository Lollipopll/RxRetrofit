package com.lifecycle.rxretrofit.net.callback

import com.lifecycle.rxretrofit.net.model.ResponseWrapper
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 *
 * @author wangzexin
 * @date 2018/1/25
 * @describe 通用的返回回调
 */
abstract class RequestCallback<T> : Observer<ResponseWrapper<T>> {
    abstract fun success(data: T)
    abstract fun failure(statusCode: Int, msg: String)
    abstract fun subscribe(d: Disposable)

    private object Status {
        const val SUCCESS = 0
    }

    override fun onSubscribe(d: Disposable) {
        subscribe(d)
    }

    override fun onNext(t: ResponseWrapper<T>) {
        if (t.errorCode == Status.SUCCESS) {
            success(t.data)
            return
        }

        failure(t.errorCode, ErrorDes.getErrorDesc(t.errorCode.toString()))
    }

    override fun onComplete() {

    }

    override fun onError(e: Throwable) {
        val apiErrorModel = ExceptionHandle.handleException(e)
        failure(apiErrorModel.status, apiErrorModel.message)
    }
}