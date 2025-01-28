import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");

        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();


        if (radius > 0) {
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;
            System.out.println("The perimeter is:" + perimeter);
            System.out.println("The area is:" + area);
        } else {
            System.out.println("The input should be greater than zero");
        }


        }
    }


