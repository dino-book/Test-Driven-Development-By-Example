package main

open class Money(var amount: Int, private val currency: String) : Expression {

    open fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && currency() == money.currency()
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }

    override fun toString(): String {
        return "$amount $currency"
    }

    fun plus(addend: Money): Expression {
        return Sum(this, addend)
    }
}