package main

class Bank {
    private val rates: HashMap<ExchangePair, Int> = HashMap()

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun addRate(fr: String, to: String, rate: Int) {
        rates[ExchangePair(fr, to)] = rate
    }

    fun rate(fr: String, to: String): Int {
        return if (fr == to) 1 else rates[ExchangePair(fr, to)]!!
    }
}
