import org.junit.Assert
import org.junit.Test

class RectangleTest{
    @Test
    fun testAreaFunction() {
        Assert.assertEquals(40F,Rectangle(10,10).calculateArea())
    }
    @Test
    fun testAreaFunctionf() {
        Assert.assertEquals(40F,Rectangle(10,10).calculateArea())
    }
}
