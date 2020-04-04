package com.ruben.data.base

interface ResponseObject<out DomainObject : Any?> {

    fun toDomain(): DomainObject

}