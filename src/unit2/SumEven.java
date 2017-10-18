package unit2;
import codehs.*;


public class SumEven extends ConsoleProgram{

    public void run() {

        int number = readInt("What is the integer: ");
        int sum = 0;
        for(int counter = 0; counter <= number; counter += 2){

            sum = sum + counter;

        }
    System.out.println("The accumulative sums of all even numbers from 0 to " + number + " is " + sum);

    }
}