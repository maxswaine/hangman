import java.util.ArrayList;

public class CheckInput {
    public void checkWin(ArrayList<Character> wordToGuess, ArrayList<Character> guessArray){
        if (guessArray.containsAll(wordToGuess)){
            System.out.println("You win!!");
        }
    }

    public void removeLife(){
    }
}
