package com.ruben.domain.postures.entity

class PostureDetail(
    override val id: String,
    override val name: String,
    override val picture: String,
    override val description: String,
    val teacher: String,
    val duration: String
) : Posture(
    id = id,
    name = name,
    picture = picture,
    description = description
)