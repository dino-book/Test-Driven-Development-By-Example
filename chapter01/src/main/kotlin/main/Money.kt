package main

open class Money(internal var amount: Int) {

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
    }
}