import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What age are you?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=13 && age <= 18){
            System.out.println("Teenager");
        }
        if (age > 18){
            System.out.println("Senior");
        }

    }
}
