import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    void ZeroWidthTest() {
        // set up user
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 5));
        assertEquals("Width must be positive", exception.getMessage());
    }

    @Test
    void NegativeWidthTest() {
        // set up user
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 5));
        assertEquals("Width must be positive", exception.getMessage());
    }

    @Test
    void ZeroHeightTest() {
        // set up user
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(10, 0));
        assertEquals("Height must be positive", exception.getMessage());
    }

    @Test
    void NegativeHeightTest() {
        // set up user
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Rectangle(10, 0));
        assertEquals("Height must be positive", exception.getMessage());
    }

    @Test
    void AreaCalculatorIntTest() {
        Rectangle rectangle = new Rectangle(5, 12);
        Double area = rectangle.computeArea();
        assertEquals(60, area);
    }

    @Test
    void AreaCalculatorFloatTest() {
        Rectangle rectangle = new Rectangle(5.5, 3);
        Double area = rectangle.computeArea();
        assertEquals(16.5, area);

    }
}
