package unit2.forLoopPractice;
import codehs.*;


public class Sum5 extends ConsoleProgram{

    public void run() {

        double sum = 0;

        for(int counter = 0; counter <= 4; counter++){
            double number = readDouble("Enter number: ");
            sum = sum + number;
        }

        System.out.println("The sum of the five numbers is " + sum);

    }
}