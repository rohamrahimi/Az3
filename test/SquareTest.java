import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void AreaCalculatorIntTest() {
        Square square = new Square(5);
        Double area = square.computeArea();
        assertEquals(25, area);
    }

    @Test
    void AreaCalculatorFloatTest() {
        Square square = new Square(2.5);
        Double area = square.computeArea();
        assertEquals(6.25, area);
    }

    @Test
    void getWidthTest() {
        Square square = new Square(5);
        assertEquals(5, square.getWidth());
    }

    @Test
    void SetWidthTest() {
        Square square = new Square(5);
        square.setWidth(10);
        assertEquals(10, square.getWidth());
    }


    @Test
    void SetWidthAndCalculateAreaTest() {
        Square square = new Square(5);
        square.setWidth(10);
        assertEquals(100, square.computeArea());
    }

}
