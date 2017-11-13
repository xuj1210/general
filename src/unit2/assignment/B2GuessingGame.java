package unit2.assignment;
import codehs.*;
import java.util.Random;

public class B2GuessingGame extends ConsoleProgram {
    public void run(){
        Random newRandom = new Random();

        int secretNumber = newRandom.nextInt(100 + 1) + 1;
        int userGuess = readInt("Guess a number: ");
        int counter = 1;

        while(userGuess != secretNumber && counter < 5){
            if(userGuess == secretNumber) {
                System.out.println("Congratulations!");
                break;
            }
            else if(userGuess > secretNumber){
                System.out.println("Too high, guess again!");
                userGuess = readInt("Guess a number: ");
                counter++;
            }
            else if(userGuess < secretNumber){
                System.out.println("Too low, guess again!");
                userGuess = readInt("Guess a number: ");
                counter++;
            }
        }
        System.out.println("Nice Try");
    }
}
