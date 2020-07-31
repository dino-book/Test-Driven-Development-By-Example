package main

class Sum(
        val augend: Expression,
        val addend: Expression
) :Expression {
    override fun reduce(bank: Bank, to: String): Money {
        val amount: Int = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }

    override fun plus(addend: Expression): Expression {
        return Money(1, "1")
    }
}