import java.util.ArrayList;

public class CheckInput {

    private boolean gameWon = false;
    private boolean correctInput = true;
    public boolean checkWin(ArrayList<Character> wordToGuess, ArrayList<Character> guessArray){
        if (guessArray.containsAll(wordToGuess)){
            gameWon = true;
            System.out.println("You win!!");
        }
        return gameWon;
    }

        public boolean checkCorrectInput(ArrayList<Character> wordToGuess, char charGuess){
            return wordToGuess.contains(charGuess);
        }
}


