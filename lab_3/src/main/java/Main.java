import java.util.List;

public class Main {
    public static void main(String[] args) {
        Color kolor1 = new Color(255,250,15,(float)0.3);
        Color kolor2 = new Color(250,250,250,(float)0.4);
        Shape rectangle = new Rectangle(2.0, 3.0,kolor1);
        Shape triangle = new Triangle(15.0, 20.0, 25.0,kolor2);
        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(rectangle);
        describer.describe(triangle);
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(List.of(rectangle, triangle));
    }

}
