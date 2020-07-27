import main.Dollar
import main.Franc
import org.junit.Test
import org.junit.Assert.*

class Test {
    @Test
    fun testDollarMultiplication() {
        val five: Dollar = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testFrancMultiplication() {
        val five: Franc = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}