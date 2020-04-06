package com.ruben.presentation.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ruben.presentation.base.viewmodel.BaseViewModel

inline fun <reified T : BaseViewModel> Fragment.viewModel(
    factory: ViewModelProvider.Factory,
    body: T.() -> Unit = {}
): T {
    val vm = ViewModelProviders.of(this, factory)[T::class.java]
    vm.body()

    return vm
}

fun <T> LifecycleOwner.observe(liveData: LiveData<T>, action: (t: T) -> Unit) {
    liveData.observe(this, Observer { it?.let { t -> action(t) } })
}