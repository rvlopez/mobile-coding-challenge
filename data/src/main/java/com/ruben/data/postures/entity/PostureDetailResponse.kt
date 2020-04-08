package com.ruben.data.postures.entity

import com.google.gson.annotations.SerializedName
import com.ruben.data.base.ResponseObject
import com.ruben.domain.postures.entity.PostureDetail

class PostureDetailResponse(
    @SerializedName(value = "_id") val id: String,
    @SerializedName(value = "name") val name: String,
    @SerializedName(value = "picture") val picture: String,
    @SerializedName(value = "description") val description: String,
    @SerializedName(value = "teacher") val teacher: String,
    @SerializedName(value = "duration") val duration: String
) : ResponseObject<PostureDetail> {

    override fun toDomain(): PostureDetail = PostureDetail(
        id = id,
        name = name,
        picture = picture,
        description = description,
        teacher = teacher,
        duration = duration
    )

}