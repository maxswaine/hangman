import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CaptureGuess  newGuess = new CaptureGuess();
        newGuess.setLives(5);
        String wordToGuess = Words.generateWord();
        DisplayWord displayWord = new DisplayWord();
        ArrayList<Character> wordToGuessArray = Words.convertWordToArray(wordToGuess);
        int lives = 5;
        displayWord.initialDisplay(wordToGuessArray);
        do {
            ArrayList<Character> charGuess = newGuess.captureGuess(wordToGuessArray);
            displayWord.displayWord(wordToGuessArray, charGuess);
            System.out.println(charGuess);
        } while (newGuess.getLives() != 0);
    }

}