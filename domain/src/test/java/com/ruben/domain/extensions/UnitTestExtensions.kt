package com.ruben.domain.extensions

import io.reactivex.Completable
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

fun <T> getSingleSuccess(value: T): Single<T> =
    Single.just(value)

fun <T : List<Any>> getSingleListSuccess(value: T): Single<T> =
    Single.just(value)

fun <T : Any> Single<T>.testAwait(): TestObserver<T> = this.test().apply {
    this.awaitTerminalEvent()
}

