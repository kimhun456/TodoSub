package com.samsung.hyunjaee.kim.domain.entity

data class Todo(
    val title: String,
    val date: Long,
    val creator: User,
    val editor: User
)
