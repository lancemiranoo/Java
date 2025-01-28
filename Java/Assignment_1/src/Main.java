
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.println("Welcome to the Letter Grade Converter");


        do {
            System.out.print("Enter Numerical grade: ");
            int grade = sc.nextInt();


            if (grade >=88 && grade <= 100){
                System.out.println("Letter grade: A");
            }
            else if (grade <=87 && grade >=80){
                System.out.println("Letter grade: B");
            }
            else if (grade <=79 && grade >=67){
                System.out.println("Letter grade: C");
            }
            else if (grade <=67 && grade >=60){
                System.out.println("Letter grade: D");
            }
            else if (grade <60){
                System.out.println("Letter grade: F");
            }
            else{
                System.out.println("Invalid grade entered.");
            }

            System.out.print("Continue? (y/n): ");
            choice = sc.next();

        }
        while (choice.equalsIgnoreCase("Y"));

        sc.close();
        System.out.println("Goodbye");

    }
}