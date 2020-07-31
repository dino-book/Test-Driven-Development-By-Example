package main

class ExchangePair(val fr: String, val to: String) {
    override fun equals(other: Any?): Boolean {
        val pair = other as ExchangePair
        return fr == pair.fr && to == pair.to
    }

    override fun hashCode(): Int {
        return 0
    }
}