import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0));
        assertEquals(6.0, triangle.getArea(), "Area calculation is incorrect.");
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0));
        assertEquals(12.0, triangle.getPerimeter(), "Perimeter calculation is incorrect.");
    }
}
