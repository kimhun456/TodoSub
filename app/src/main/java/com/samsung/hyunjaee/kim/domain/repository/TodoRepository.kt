package com.samsung.hyunjaee.kim.domain.repository

import com.samsung.hyunjaee.kim.domain.entity.Todo

interface TodoRepository {
    fun createTodo(todo: Todo)
    fun readTodo(id: String): Todo
    fun editTodo(todo: Todo, id: String)
    fun deleteTodo(id: String)
}