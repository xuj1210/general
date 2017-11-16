package unit2.assignment;
import codehs.*;
/*
A program that allows the user to input three ages and tells if at least one of them
are teenagers(Ages 13-19 years old)
Author: Joshua Xu
 */

public class A2HasTeen extends ConsoleProgram {

    public void run() {
        //Get three age inputs from user
        int teenAgeInput1 = readInt("Enter an age: ");
        int teenAgeInput2 = readInt("Enter an age: ");
        int teenAgeInput3 = readInt("Enter an age: ");

        //Determine if any of the three inputs are in the range of 13-19, and prints true or false
        if(teenAgeInput1 >= 13 && teenAgeInput1 <= 19) {
            System.out.println("True");
        }
        else if(teenAgeInput2 >= 13 && teenAgeInput2 <= 19){
            System.out.println("True");
        }
        else if(teenAgeInput3 >= 13 && teenAgeInput3 <= 19) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}