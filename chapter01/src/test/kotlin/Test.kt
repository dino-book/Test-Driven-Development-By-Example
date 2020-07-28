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
        assertTrue(Money.dollar(5) == Dollar(5))
        assertFalse(Money.dollar(5) == Dollar(6))
        assertTrue(Money.franc(5) == Franc(5))
        assertFalse(Money.franc(5) == Franc(6))
        assertFalse(Money.franc(5) == Dollar(6))
    }
}