import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CaptureGuess  newGuess = new CaptureGuess();
        String wordToGuess = Words.generateWord();

        ArrayList<Character> charGuess = newGuess.captureGuess(wordToGuess);
        System.out.println(charGuess);
    }

}