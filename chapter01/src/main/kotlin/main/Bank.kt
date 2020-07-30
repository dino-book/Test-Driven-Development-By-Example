package main

class Bank {
    fun reduce(source: Expression, to: String): Money {
        val sum: Sum = source as Sum
        return sum.reduce(to)
    }
}
