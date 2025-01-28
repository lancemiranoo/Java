import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int m = sc.nextInt();
        int i = 1;
        int product = 0;
        while(i <=10){
            product = m * i;
            System.out.println(m + " " + "x " + i + " " + "=" + " " + product );
            i++;
        }
    }
}