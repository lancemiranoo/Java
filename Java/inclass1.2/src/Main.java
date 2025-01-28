import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number");
        double a = sc.nextDouble();


        System.out.println("Enter the power:");
        double b = sc.nextDouble();

        double output = Math.pow(a,b);

        System.out.println("The output is:"+ " " + output);

    }

}


