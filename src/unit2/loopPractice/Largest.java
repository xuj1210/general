package unit2.loopPractice;
import codehs.*;


public class Largest extends ConsoleProgram{

    public void run() {
        int number = readInt("Enter an integer: ");
        int largest = number;
        while(number != -1){
            if(largest < number){
                largest = number;

            }
            number = readInt("Enter an integer: ");

        }
    System.out.println("The largest number is " + largest);
    }
}