import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CaptureGuess  newGuess = new CaptureGuess();
        ChooseDifficulty chooseDifficulty = new ChooseDifficulty();
        CheckInput checkInput = new CheckInput();
        String wordToGuess = Words.generateWord();
        DisplayWord displayWord = new DisplayWord();
        ArrayList<Character> wordToGuessArray = Words.convertWordToArray(wordToGuess);

        chooseDifficulty.printDifficulties();
        int lives = chooseDifficulty.getIntegerInput();
        displayWord.initialDisplay(wordToGuessArray);
        chooseDifficulty.setLives(lives);
        do {
            ArrayList<Character> charGuess = newGuess.captureGuess(wordToGuessArray, lives);
            displayWord.displayWord(wordToGuessArray, charGuess);
            checkInput.checkWin(wordToGuessArray, charGuess);
            System.out.println(lives);
        } while (lives != 0);
    }

}