import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 5; 
        String secretWord = "Love";
        System.out.println("Welcome to guess the word");
       while (attempts > 0) {
            System.out.print("Guess the word: ");
            String guessWord = sc.nextLine();
           if (guessWord.equalsIgnoreCase(secretWord)) { 
                System.out.println("You guessed it right!");
                break; 
            } else {
                if (guessWord.length() < secretWord.length()) {
                    System.out.println("Your guess is too short.");
                } else if (guessWord.length() > secretWord.length()) {
                    System.out.println("Your guess is too long.");
                }
                attempts--;          
                System.out.println("Wrong guess! Attempts left: " + attempts);
            }
        }
        if (attempts == 0) {
            System.out.println("You've run out of attempts! The secret word was: " + secretWord);
        }

        sc.close(); 
    }
}
