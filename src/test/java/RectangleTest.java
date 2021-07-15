import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(3,4);



    // WHEN-THEN
    @org.junit.Test
    public void whenLength3AndWidth4ThenArea12() {
        assertEquals(12,rectangle.getArea());

    }

    @Test
    public void getPerimeter() {
        assertEquals(14, rectangle.getPerimeter());
    }

    @Test
    public void getDiagonal() {
        assertEquals(5,rectangle.getDiagonal(), 0.01);
    }

}