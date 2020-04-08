package com.ruben.data.extensions

import io.reactivex.Single
import io.reactivex.observers.TestObserver

fun <T : Any> TestObserver<T>.assertGeneralsSuccess(asserts: (T) -> Boolean = { true }) {
    assertComplete()
    assertValueCount(1)
    assertNoErrors()
    assertValue {
        asserts(it)
    }
}

fun <T> getSingleResultSuccess(value: T): Single<T> =
    Single.just(value)

fun <T : List<Any>> getSingleListResultSuccess(value: T): Single<T> =
    Single.just(value)

