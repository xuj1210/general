package unit2.assignment;
import codehs.*;


public class B3DivisorCount extends ConsoleProgram {

    public void run() {
        //Get userNumber from user
        int userNumber = readInt("Enter an integer you want the divisors for: ");
        System.out.println("The divisors of " + userNumber + " are:");

        //
        for(int counter = 1; counter <= userNumber; counter++){
            if(userNumber % counter == 0){
                System.out.println(counter);
            }
        }
    }
}