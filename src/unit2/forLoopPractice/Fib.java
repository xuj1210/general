package unit2.forLoopPractice;
import codehs.*;


public class Fib extends ConsoleProgram{

    public void run() {
        int nTerm = readInt("Enter term number in the Fibonnaci sequence: ");
        int sum = 0;
        int num1 = 1;
        int num2 = 0;

        for(int counter = 0; counter < nTerm; counter++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println("The " + nTerm + "th term in the fibonacci sequence is " + sum);
    }
}