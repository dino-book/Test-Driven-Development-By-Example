import main.Dollar
import main.Franc
import main.Money
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
        assertTrue(Money.franc(5) == Money.franc(5))
        assertFalse(Money.franc(5) == Money.franc(6))
        assertFalse(Money.franc(5) == Money.dollar(6))
    }

    @Test
    fun testDifferentClassEquality() {
        assertTrue(Money(10, "CHF") == Franc(10, "CHF"))
    }

    @Test
    fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }
}