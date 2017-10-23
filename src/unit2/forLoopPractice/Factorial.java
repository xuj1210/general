package unit2.forLoopPractice;
import codehs.*;


public class Factorial extends ConsoleProgram{

        public void run() {
            int number = readInt("Enter the number you want to find the factorial of: ");
            int product = 1;

            for(int counter = number; counter > 0; counter--){
                product = counter * product;

            }
            System.out.println("The factorial of " + number + " is " + product);
        }
    }
