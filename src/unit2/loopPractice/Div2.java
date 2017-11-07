package unit2.loopPractice;
import codehs.ConsoleProgram;

/**
 * Write a program Div2 , that uses a loop to compute (do not use division!!)
 * and return how many times a number n (inputted by user) can be divided by 2.  Assume n  > 0
 */
public class Div2 extends ConsoleProgram {

    public void run(){
        int number = readInt("Enter a number: ");

        int divCount = 0;
        int remaining = number;

        while(remaining >= 2){

            // System.out.println("remaining: " + remaining);
            remaining = remaining - 2;
            divCount++;
        }

        System.out.println(divCount);
    }
}