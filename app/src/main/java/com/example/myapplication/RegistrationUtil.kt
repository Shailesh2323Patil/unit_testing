package com.example.myapplication

object RegistrationUtil {

    val existingUser = listOf("Phillip","Carl")

    fun checkRegistrationUtils(
        username : String,
        password : String,
        confirmPassword : String
    ) : Boolean {

        if(username.isEmpty() || password.isEmpty()) {
            return false
        }

        if(username in existingUser) {
            return false
        }

        if(password != confirmPassword) {
            return false
        }

        if(password.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }

}