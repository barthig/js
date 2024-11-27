abstract class Shape {
    public String name;
    public Color color;
    public String getName() {
        return this.name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getColorDescription () {
        return String.format("RED : %d; GREEN : %d; BLUE : %d Alpha : %.2f", color.red(), color.green(), color.blue(), color.alpha());
    }
}
class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height,Color color) {
        this.name = "Rectangle";
        this.width = width;
        this.height = height;
        this.color = color;

    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
class Triangle extends Shape{
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c,Color color) {
        this.name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
