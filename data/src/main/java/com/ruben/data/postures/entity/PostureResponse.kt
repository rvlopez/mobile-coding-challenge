package com.ruben.data.postures.entity

import com.google.gson.annotations.SerializedName
import com.ruben.data.base.ResponseObject
import com.ruben.domain.postures.entity.Posture

open class PostureResponse(
    @SerializedName(value = "id") open val id: String,
    @SerializedName(value = "name") open val name: String,
    @SerializedName(value = "picture") open val picture: String,
    @SerializedName(value = "description") open val description: String
) : ResponseObject<Posture> {

    override fun toDomain(): Posture = Posture(
        id = id,
        name = name,
        picture = picture,
        description = description
    )

}