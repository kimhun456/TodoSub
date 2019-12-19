package com.samsung.hyunjaee.kim.domain.repository

import com.samsung.hyunjaee.kim.domain.entity.User

interface UserRepository {
    fun createUser(user: User)
    fun readUser(id: String)
    fun editUser(user: User, id: String)
    fun deleteUser(id: String)
}