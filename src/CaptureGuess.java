import java.util.ArrayList;
import java.util.Scanner;

public class CaptureGuess {

    public ArrayList<Character> captureGuess(String word) {
        Scanner characterGuess = new Scanner(System.in);
        String guess;
        char charGuess = 0;
        ArrayList <Character> guessArray = new ArrayList<>();
        System.out.println(word);
        for (int i = 0; i < word.length(); i++) {


                System.out.println("Guess a letter:");
                guess = characterGuess.nextLine();

                if (guess.length() != 1 || !guess.matches("[a-zA-Z]")) {
                    System.out.println("Please input a valid, singular alphabet character");
                } else {
                    charGuess = guess.charAt(0);
                    guessArray.add(charGuess);
                    System.out.println(guessArray);
                }
        }
        return guessArray;
    }

    public int removeLife(int lives){
        lives --;
        return lives;
    }
}
