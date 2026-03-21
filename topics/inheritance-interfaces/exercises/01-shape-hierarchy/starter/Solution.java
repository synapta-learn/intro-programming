abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        // TODO: return pi * radius * radius
        return 0;
    }

    @Override
    public double perimeter() {
        // TODO: return 2 * pi * radius
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        // TODO: return width * height
        return 0;
    }

    @Override
    public double perimeter() {
        // TODO: return 2 * (width + height)
        return 0;
    }
}
