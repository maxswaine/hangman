import java.util.ArrayList;
import java.util.Scanner;

public class CaptureGuess {
    private ArrayList<Character> guessArray = new ArrayList<>();

    public ArrayList<Character> captureGuess(ArrayList<Character> wordToGuess, int lives) {
        Scanner characterGuess = new Scanner(System.in);
        String guess;
        char charGuess = 0;
        System.out.println(wordToGuess);

        System.out.println("Guess a letter:");
        guess = characterGuess.nextLine();

        if (guess.length() != 1 || !guess.matches("[a-zA-Z]") || guessArray.contains(guess.charAt(0))) {
            System.out.println("Please input a valid, singular alphabet character");
        } else {
            charGuess = guess.charAt(0);
            guessArray.add(charGuess);
            System.out.println(guessArray);
        }

        System.out.println(guessArray);
        return guessArray;
    }
}
