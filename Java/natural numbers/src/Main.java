import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int m = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= m; i++){
            n = n + i;
        }
        System.out.println(n);

    }
}