public class Main {
    public static void main(String[] args) {
        Color kolor1 = new Color(1,2,3,(float)0.3);
        Color kolor2 = new Color(2,3,4,(float)0.4);
        Shape rectangle = new Rectangle(2.0, 3.0,kolor1);
        Shape triangle = new Triangle(4.0, 4.0, 5.0,kolor2);
        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(rectangle);
        describer.describe(triangle);
    }
}
