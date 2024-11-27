import java.util.List;

public class Main {
    public static void main(String[] args) {
        Color kolora = new Color(255,250,15,(float)0.3);
        Color kolorb = new Color(0,0,250,(float)0.4);
        Shape rectangle = new Rectangle(2.0, 3.0,kolora);
        Shape triangle = new Triangle(15.0, 20.0, 25.0,kolorb);
        Shape triangle1= new Triangle(12,16,20,kolora);


        ShapeDescriber describer = new ShapeDescriber();
        describer.describedrawingshape(rectangle);
        describer.describedrawingshape(triangle);
        describer.describedrawingshape(triangle1);


        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(List.of(rectangle, triangle,triangle1));
    }

}
