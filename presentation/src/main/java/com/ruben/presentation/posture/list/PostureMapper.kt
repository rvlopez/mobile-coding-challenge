package com.ruben.presentation.posture.list

import com.ruben.domain.postures.entity.Posture
import com.ruben.presentation.base.MapperUI
import com.ruben.presentation.posture.entity.PostureUI

class PostureMapper : MapperUI<Posture, PostureUI> {

    override fun mapToUI(obj: Posture): PostureUI = with(obj) {
        PostureUI(id = id, name = name, picture = picture, description = description)
    }

}