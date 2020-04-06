package com.ruben.presentation.extensions

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.appcompat.content.res.AppCompatResources
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.ruben.presentation.R

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View =
    LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)

fun ImageView.load(
    url: String?,
    @DrawableRes placeholderRes: Int = R.drawable.mock_img,
    onSuccess: () -> Unit = {},
    onError: () -> Unit = {}
) {
    val safePlaceholderDrawable = AppCompatResources.getDrawable(context, placeholderRes)
    val requestOptions = RequestOptions().apply {
        placeholder(safePlaceholderDrawable)
        error(safePlaceholderDrawable)
    }
    val glideRequest = GlideApp
        .with(context)
        .setDefaultRequestOptions(requestOptions)
        .load(url)
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                onError()
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                onSuccess()
                return false
            }
        })

    glideRequest.into(this)
}
