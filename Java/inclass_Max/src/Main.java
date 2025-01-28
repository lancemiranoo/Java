import java.util.Scanner;

public class Main {
    public int number(int a, int b){
        if (a > b){
            return a;
        } else if (a == b){
            System.out.println("Both numbers are the same");
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Maximum: " + obj.number(14,11));
    }
}