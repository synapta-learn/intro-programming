import java.util.ArrayList;

abstract class Shape {
    public abstract double area();
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
        return Math.PI * radius * radius;
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
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class InstanceofFilter {

    /**
     * Returns a new list containing only the Circle objects from the input.
     */
    public static ArrayList<Circle> filterCircles(ArrayList<Shape> shapes) {
        // TODO: Filter using instanceof
        return new ArrayList<>();
    }

    /**
     * Returns the total area of only the circles in the list.
     */
    public static double totalCircleArea(ArrayList<Shape> shapes) {
        // TODO: Sum areas of circles only
        return 0;
    }

    /**
     * Returns the circle with the largest radius, or null if none.
     */
    public static Circle largestCircle(ArrayList<Shape> shapes) {
        // TODO: Find the circle with the largest radius
        return null;
    }

    /**
     * Returns a description string for each shape.
     */
    public static ArrayList<String> describeAll(ArrayList<Shape> shapes) {
        // TODO: Create a description for each shape based on its type
        return new ArrayList<>();
    }
}
