import org.junit.jupiter.api.Test;

import java.util.List;

public class ShapeRendererTest {

    @Test
    public void testRenderShapes() {
        Shape rectangle = new Rectangle(4.0, 5.0, new Color(255, 0, 0));
        Shape triangle = new Triangle(3.0, 4.0, 5.0, new Color(0, 255, 0));

        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(List.of(rectangle, triangle));
    }
}
