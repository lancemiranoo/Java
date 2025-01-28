class Shape {
    public void     getPerimeter() {
        System.out.println("123");
    }
    public void getArea() {
        System.out.println("456");
    }
}
class Circle extends Shape {
    double Radius;

    Circle(double radius){
        Radius = radius;
    }
    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * Radius;
        System.out.println("The perimeter is: " + perimeter);
    }
    @Override
    public void getArea() {
        double area = Math.PI * Math.pow(Radius, 2);
        System.out.println("The area is: " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        Circle bola = new Circle(3);
        bola.getPerimeter();
        bola.getArea();
    }
}