package unit2.assignment;
import codehs.*;
/*
This program finds the divisors of an integer inputted by the user and prints them out
Author: Joshua Xu
*/

public class B3DivisorCount extends ConsoleProgram {

    public void run() {
        //Get userNumber from user
        int userNumber = readInt("Enter an integer you want the divisors for: ");
        System.out.println("The divisors of " + userNumber + " are:");

        //For loop to find and check divisors of userNumber
        for(int counter = 1; counter <= userNumber; counter++){
            if(userNumber % counter == 0){
                System.out.println(counter);
            }
        }
    }
}
