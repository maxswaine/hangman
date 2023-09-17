import java.util.ArrayList;
import java.util.Scanner;

public class CaptureGuess {
    private ArrayList <Character> guessArray = new ArrayList<>();


    private int lives;
    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


    public ArrayList<Character> captureGuess(ArrayList<Character> wordToGuess, int lives) {
        Scanner characterGuess = new Scanner(System.in);
        String guess;
        char charGuess = 0;
        System.out.println(wordToGuess);
        do {


                System.out.println("Guess a letter:");
                guess = characterGuess.nextLine();

                if (guess.length() != 1 || !guess.matches("[a-zA-Z]")) {
                    System.out.println("Please input a valid, singular alphabet character");
                } else{
                    charGuess = guess.charAt(0);
                    guessArray.add(charGuess);
                    if (!wordToGuess.contains(charGuess)) {
                        this.lives = removeLife(this.lives);
                    }
                }


        } while (this.lives != 0);
        System.out.println(guessArray);
        return guessArray;
    }

    public ArrayList<Character> getGuessArray() {
        return guessArray;
    }

    public int removeLife(int lives){
        setLives(lives-1);
        return lives;
    }
}
