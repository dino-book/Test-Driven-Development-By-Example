package main

class Dollar(amount: Int, currency: String) : Money(amount, currency) {

    override fun times(multiplier: Int): Money {
        return dollar(amount * multiplier)
    }
}