import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman3 {


    public static void main(String args[]) throws FileNotFoundException {
        // TODO code application logic here
       List<String> words = new ArrayList<>();
       Scanner scanner = new Scanner(new File("D:\\FullStackJava\\Source Code\\words_alpha.txt"));
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
       
      int wrongCount = 0;
       while(true)
            {
                
                System.out.println(" -------");
                System.out.println(" |     |");
                if (wrongCount >= 1) {
                    System.out.println(" O");
                  }

                  if (wrongCount >= 2) {
                    System.out.print("\\ ");
                    if (wrongCount >= 3) {
                      System.out.println("/");
                    }
                    else {
                      System.out.println("");
                    }
                  }

                  if (wrongCount >= 4) {
                    System.out.println(" |");
                  }

                  if (wrongCount >= 5) {
                    System.out.print("/ ");
                    if (wrongCount >= 6) {
                      System.out.println("\\");
                    }
                    else {
                      System.out.println("");
                    }
                  }
                  System.out.println("");
                  System.out.println("");
                
                
                printWordState(word, playerGuesses);
               
                // it will take user input guesses
                if (getPlayerGuess(keyboard, playerGuesses, word)) {
                    wrongCount++;
                }
                
                if (printWordState(word, playerGuesses)) {
                 System.out.println("You Win!");
                break;
                }
                System.out.println("Please enter your guess for the word : ");
               if (keyboard.nextLine().equals(word))
                {
                    System.out.println("You Win!");
                    break;
                }
               
               else
               {
                    System.out.println("No! Try again!");
               }  
            
            }
       
    }

    private static boolean getPlayerGuess(Scanner keyboard, List<Character> playerGuesses, String word) {
        System.out.println("Please enter a letter");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
        // show if we are keeping this on here what will happen, its a duplicate
        // this is alreay in getPlayerGuess  function so no need of the line belo and because of the while loop its repeated
        //printWordState(word, playerGuesses);
        return(word.contains(letterGuess));
        
    }

    private static boolean printWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for (int i =0;i< word.length();i++)
        {
            if (playerGuesses.contains(word.charAt(i)))
            {
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else
            {
                System.out.print("-");
            }
        }
       System.out.println();
       return(word.length() == correctCount);
    }
}
