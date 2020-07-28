package main

abstract class Money(internal var amount: Int, private val currency: String) {

    abstract fun times(multiplier: Int): Money

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && javaClass == money.javaClass
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Franc(amount, "CHF")
        }
    }
}