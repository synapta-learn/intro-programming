import java.util.ArrayList;
import java.util.Collections;

abstract class Shape implements Comparable<Shape> {
    public abstract double area();
    public abstract String name();

    @Override
    public int compareTo(Shape other) {
        // TODO: Compare by area ascending
        return 0;
    }

    @Override
    public String toString() {
        // TODO: return "[name]: area=[area]" with 2 decimal places
        return "";
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO: pi * r * r
        return 0;
    }

    @Override
    public String name() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        // TODO: width * height
        return 0;
    }

    @Override
    public String name() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        // TODO: 0.5 * base * height
        return 0;
    }

    @Override
    public String name() {
        return "Triangle";
    }
}

public class Solution {

    /**
     * Sorts the list of shapes by area (ascending) in place and returns it.
     */
    public static ArrayList<Shape> sortByArea(ArrayList<Shape> shapes) {
        // TODO: Sort the list using Collections.sort()
        return shapes;
    }

    /**
     * Returns the total area of all shapes in the list.
     */
    public static double totalArea(ArrayList<Shape> shapes) {
        // TODO: Sum all areas
        return 0;
    }
}
