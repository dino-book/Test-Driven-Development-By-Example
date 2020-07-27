package main

class Dollar(private var amount: Int) {
    init {
        println(amount)
    }
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    fun equal(any: Any): Boolean {
        val dollar: Dollar = any as Dollar
        return amount == dollar.amount
    }
}