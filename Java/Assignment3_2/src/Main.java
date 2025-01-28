abstract class Shape {
    // Abstract method to calculate the area
    public abstract double calculateArea();
}

// Subclass: Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea() method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // Area of circle: πr²
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea() method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;  // Area of rectangle: length × width
    }
}

// Subclass: Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize the base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the calculateArea() method for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;  // Area of triangle: 1/2 × base × height
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create instances of Circle, Rectangle, and Triangle
        Shape circle = new Circle(4);      // Circle with radius 5
        Shape rectangle = new Rectangle(4, 4);  // Rectangle with length 4 and width 6
        Shape triangle = new Triangle(4, 4);  // Triangle with base 4 and height 6

        // Display the areas of the shapes
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}