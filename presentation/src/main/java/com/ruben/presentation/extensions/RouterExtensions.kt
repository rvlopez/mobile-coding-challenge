package com.ruben.presentation.extensions

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle
import androidx.fragment.app.Fragment
import java.io.IOException
import java.io.Serializable

inline fun <reified T : Serializable> Fragment.setSerializableParam(obj: T, tag: String = "") {
    if (arguments == null) {
        arguments = Bundle()
    }
    arguments?.putSerializable(T::class.java.name + tag, obj)
}

inline fun <reified T : Serializable> Fragment.getSerializableParam(
    errorMessage: String = "${this::class.java.simpleName} needs a ${T::class.java.simpleName} to populate",
    tag: String = ""
): T =
    (arguments?.getSerializable(T::class.java.name + tag) ?: throw IOException(errorMessage)) as T
