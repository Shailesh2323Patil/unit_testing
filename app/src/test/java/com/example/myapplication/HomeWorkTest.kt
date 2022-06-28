package com.example.myapplication



import android.util.Log
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeWorkTest {

    @Test
    fun `check the fibonacci number`() {
        var result = HomeWork.fib(5)

        Log.e("Fab",result.toString())
    }


    @Test
    fun `check the braces is not equals returns false`() {
        val result = HomeWork.checkBraces("(a+b))")

        assertThat(result).isFalse()
    }

    @Test
    fun `check the braces is equals returns true`() {
        val result = HomeWork.checkBraces("((a+b))")

        assertThat(result).isTrue()
    }

    @Test
    fun `check the braces are odd braces return false`() {
        val result = HomeWork.checkBraces(")(")

        assertThat(result).isFalse()
    }
}