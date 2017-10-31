package unit2.loopPractice;
import codehs.*;


public class OddSum extends ConsoleProgram{

    public void run() {
        int number = readInt("Enter an integer: ");
        int sum = 0;
        for(int counter = 1; counter <= number; counter += 2){
            sum = sum + counter;
        }
    System.out.println("The accumulative of all odd numbers from 1 to " + number + " is " + sum);
    }
}