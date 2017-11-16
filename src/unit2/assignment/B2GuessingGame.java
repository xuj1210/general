package unit2.assignment;
import codehs.*;
import java.util.Random;
/*
A program that secretly generates a number in between 1 and 100, and gives the user 5 attempts
to guess what that number is.
Author: Joshua Xu
 */
public class B2GuessingGame extends ConsoleProgram {

    public void run(){
        //New random
        Random newRandom = new Random();

        //Initialize variables
        int secretNumber = newRandom.nextInt(100 + 1) + 1;
        int userGuess = readInt("Guess a number: ");
        int counter = 1;

        //While loop for user guesses and prints appropriate message
        while(counter < 6){
            if(counter == 5){
                System.out.println("Nice Try");
                break;
            }
            else if(userGuess == secretNumber) {
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
    }
}
