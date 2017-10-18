package unit2;
import codehs.*;


public class Avg5 extends ConsoleProgram{

    public void run() {

        double sum = 0;
        for(int counter = 0; counter <= 4; counter++){
            double number = readDouble("Enter a number: ");
            sum = sum + number;
        }
        double answer = sum / (double)5;
        System.out.println("The average of the 5 numbers is " + answer);
    }
}