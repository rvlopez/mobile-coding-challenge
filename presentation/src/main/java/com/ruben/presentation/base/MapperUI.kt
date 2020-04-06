package com.ruben.presentation.base

interface MapperUI<DomainObject, UIObject> {

    fun mapToUI(obj: DomainObject): UIObject

}