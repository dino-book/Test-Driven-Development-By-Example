import main.Dollar
import org.junit.Test
import org.junit.Assert.*

class Test {
    @Test
    fun testMultiplication() {
        val five: Dollar = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equal(Dollar(5)))
        assertFalse(Dollar(5).equal(Dollar(6)))
    }
}