import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CaptureGuess  newGuess = new CaptureGuess();
        Lives setLives = new Lives();
        CheckInput checkInput = new CheckInput();
        String wordToGuess = Words.generateWord();
        DisplayWord displayWord = new DisplayWord();
        ArrayList<Character> wordToGuessArray = Words.convertWordToArray(wordToGuess);

        setLives.printDifficulties();
        int lives = setLives.setDifficulty();
        displayWord.initialDisplay(wordToGuessArray);
        setLives.setLives(lives);
        do {
            ArrayList<Character> charGuess = newGuess.captureGuess(wordToGuessArray, lives);
            displayWord.displayWord(wordToGuessArray, charGuess);
            boolean correctInput = checkInput.checkCorrectInput(wordToGuessArray, charGuess.get(charGuess.size() -1 ));
            if (!correctInput){
                setLives.loseOneLife();
            }
            System.out.println(setLives.getLives());
        } while (setLives.getLives() != 0);
    }

}