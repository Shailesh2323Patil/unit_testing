package com.example.myapplication


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.checkRegistrationUtils(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.checkRegistrationUtils(
            "Phillip123",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.checkRegistrationUtils(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty return false`() {
        val result = RegistrationUtil.checkRegistrationUtils(
            "Phillip",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly return false`() {
        val result = RegistrationUtil.checkRegistrationUtils(
            "Phillip",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits return false`() {
        val result = RegistrationUtil.checkRegistrationUtils(
            "Phillip",
            "phillip12",
            "phillip12"
        )
        assertThat(result).isFalse()
    }
}