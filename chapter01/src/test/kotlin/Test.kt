import main.Bank
import main.Expression
import main.Money
import main.Sum
import org.junit.Test
import org.junit.Assert.*

class Test {
    @Test
    fun testDollarMultiplication() {
        val five: Money = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testFrancMultiplication() {
        val five: Money = Money.franc(5)
        assertEquals(Money.franc(10), five.times(2))
        assertEquals(Money.franc(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5) == Money.dollar(5))
        assertFalse(Money.dollar(5) == Money.dollar(6))
        assertFalse(Money.franc(5) == Money.dollar(6))
    }

    @Test
    fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }

    @Test
    fun testSimpleAddition() {
        val five: Money = Money.dollar(5)
        val sum: Expression = five.plus(five)
        val bank: Bank = Bank()
        val reduced: Money = bank.reduce(sum, "USD")
        assertEquals(reduced, Money.dollar(10))
    }

    @Test
    fun testPlusReturnsSum() {
        val five: Money = Money.dollar(5)
        val result: Expression = five.plus(five)
        val sum: Sum = result as Sum
        assertEquals(five, sum.augend)
        assertEquals(five ,sum.addend)
    }

    @Test
    fun testReduceSum() {
        val sum: Expression = Sum(Money.dollar(3), Money.dollar(4))
        val bank: Bank = Bank()
        val result: Money = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(7), result)
    }

    @Test
    fun testReduceMoney() {
        val bank: Bank = Bank()
        val result: Money = bank.reduce(Money.dollar(1), "USD")
        assertEquals(Money.dollar(1), result)
    }
}