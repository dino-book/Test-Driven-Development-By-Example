import main.Dollar
import org.junit.Test
import org.junit.Assert.*

class Test {
    @Test
    fun testMultiplication() {
        val five: Dollar = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}