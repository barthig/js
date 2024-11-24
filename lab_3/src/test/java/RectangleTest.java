import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, new Color(255, 0, 0));
        assertEquals(20.0, rectangle.getArea(), "Area calculation is incorrect.");
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, new Color(255, 0, 0));
        assertEquals(18.0, rectangle.getPerimeter(), "Perimeter calculation is incorrect.");
    }
}
