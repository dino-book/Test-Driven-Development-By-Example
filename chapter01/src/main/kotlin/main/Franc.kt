package main

class Franc(private var amount: Int) {

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    fun equal(any: Any): Boolean {
        val franc: Franc = any as Franc
        return amount == franc.amount
    }
}