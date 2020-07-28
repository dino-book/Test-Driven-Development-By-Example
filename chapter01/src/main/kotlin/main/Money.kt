package main

abstract class Money(internal var amount: Int) {
    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && javaClass == money.javaClass
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount)
        }

        fun franc(amount: Int): Money {
            return Franc(amount)
        }
    }
}