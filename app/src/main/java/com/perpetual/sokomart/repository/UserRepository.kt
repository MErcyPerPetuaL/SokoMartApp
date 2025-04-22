package com.perpetual.sokomart.repository



import com.perpetual.sokomart.data.UserDao
import com.perpetual.sokomart.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}