import java.util.List;

public class ShapeRenderer {

    public void renderShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Rysowanie figury:");
            System.out.println("Typ: " + shape.getName());
            System.out.println("Kolor: " + shape.getColorDescription());
            System.out.println("Graficzna reprezentacja:");
            drawingShape(shape);
            System.out.println(resetColor());
            System.out.println();
        }
    }

    private void drawingShape(Shape shape) {
        if (shape instanceof Rectangle) {
            drawingRectangle((Rectangle) shape);
        }
        if (shape instanceof Triangle) {
            drawingTriangle((Triangle) shape);
        }
    }

    private void drawingRectangle(Rectangle rectangle) {
        String colorCode = getColorCodeofShape(rectangle.color);
        for (int i = 0; i < (int)rectangle.height; i++) {
            System.out.println(colorCode + "* ".repeat((int)rectangle.width) + resetColor());
        }
    }

    private void drawingTriangle(Triangle triangle) {
        double a = triangle.a;
        double b = triangle.b;
        double c = triangle.c;
        double base = Math.max(a, Math.max(b, c));
        double area = triangle.getArea();

        int height = (int)Math.round((2 * area) / base);

        String colorCode = getColorCodeofShape(triangle.color);

        for (int i = 1; i <= height; i++) {
            int stars = (int)Math.round((i * base) / height);
            System.out.println(" ".repeat(height - i) + colorCode + "* ".repeat(stars) + resetColor());
        }
    }

    private String getColorCodeofShape(Color color) {
        return String.format("\u001B[38;2;%d;%d;%dm", color.red(), color.green(), color.blue());
    }

    private String resetColor() {
        return "\u001B[0m";
    }
}
