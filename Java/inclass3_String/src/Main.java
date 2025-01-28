import java.util.Scanner;

public class Main {
    public static int vowelCount(String str) {
        int count = 0;

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCountResult = vowelCount(input);

        System.out.println("Number of vowels: " + vowelCountResult);

        scanner.close();
    }
}