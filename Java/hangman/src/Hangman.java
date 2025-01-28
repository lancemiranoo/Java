import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String args[]) throws FileNotFoundException {
        // TODO code application logic here
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(new File ("D:\\FullStackJava\\words_alpha.txt"));
        Scanner keyboard = new Scanner(System.in);
        while (scanner.hasNext())
        {
            // System.out.println(scanner.nextLine());
            words.add(scanner.nextLine());
        }

        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));

        System.out.println(word);

        List<Character> playerGuesses = new ArrayList<>();

        // printWordState(word, playerGuesses);

        for (int i = 0;i< word.length();i++)
        {
            if (playerGuesses.contains(word.charAt(i)))
            {
                System.out.println(word.charAt(i));
            }
            else
            {
                System.out.println("-");
            }
            System.out.println();

            // getPlayerGuess(keyboard, playerGuesses, word);
        }
    }
}