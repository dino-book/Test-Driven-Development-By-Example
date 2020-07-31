package main

open class Money(var amount: Int, private val currency: String) : Expression {

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

    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun reduce(bank: Bank, to: String): Money {
        val rate: Int = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

    override fun times(multiplier: Int): Expression {
        return Money(amount * multiplier, currency)
    }
}