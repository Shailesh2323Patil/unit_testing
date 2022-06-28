package com.example.myapplication

object HomeWork {

    fun fib(n : Int) : Long {
        if(n == 0 || n == 1) {
            return n.toLong()
        }

        var a = 0L
        var b = 1L
        var c = 1L

        (1..n - 1).forEach { i ->
            c = a + b
            a = b
            b = c
        }

        return c
    }

    fun checkBraces(string: String) : Boolean {

        var leftBracketIndex = string.indexOf(")")
        var rightBracketIndex = string.indexOf("(")

        if(leftBracketIndex < rightBracketIndex) {
            return false
        }

        return string.count { it == '(' } == string.count { it == ')' }
    }

}