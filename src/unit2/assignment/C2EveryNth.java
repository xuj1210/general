package unit2.assignment;
import codehs.*;
/*
A program that gets a string and integer from the user, and prints every Nth letter of the
word, where N is the integer given by the user.
 */

public class C2EveryNth extends ConsoleProgram {

    public void run() {
        //Get the string and N integer from user
        String userString = readLine("Enter a string: ");
        int everyNth = readInt("Enter an integer: ");
        int letterCount = 0;

        //For loop to print out the Nth letters of the word
        for(int counter = 0; counter < userString.length(); counter += everyNth){
            System.out.print(userString.substring(letterCount, letterCount + 1));
            letterCount += everyNth;
        }
    }
}