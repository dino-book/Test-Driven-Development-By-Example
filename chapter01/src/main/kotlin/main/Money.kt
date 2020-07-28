package main

open class Money(internal var amount: Int, internal val currency: String) {

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
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Franc(amount, "CHF")
        }
    }

    override fun toString(): String {
        return "$amount $currency"
    }
}