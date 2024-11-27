import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ShapeDescriberTest {

    @Test
    public void testDescribe() {
        Shape shape = mock(Shape.class);
        when(shape.getName()).thenReturn("MockShape");
        when(shape.getArea()).thenReturn(10.0);
        when(shape.getPerimeter()).thenReturn(20.0);
        when(shape.getColorDescription()).thenReturn("Red: 255, Green: 0, Blue: 0, Alpha: 1.0");

        ShapeDescriber describer = new ShapeDescriber();
        describer.describedrawingshape(shape);

        verify(shape).getName();
        verify(shape).getArea();
        verify(shape).getPerimeter();
        verify(shape).getColorDescription();
    }
}
