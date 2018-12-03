package com.lifecycle.rxretrofit.net.rxutils

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }
}