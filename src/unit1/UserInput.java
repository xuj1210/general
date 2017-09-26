/*
 A general program template utilizing codehs ConsoleProgram.
 The main method and user input method have been abstracted
 for simplification.

 1) Change this description to appropriately describe the program
 2) Change the class name to match the file name
 3) Refer to documentation for configuring your program to run.

 @author: EDIT: yourName
 */

package unit1;    // EDIT: set to appropriate lesson unit for this program
import codehs.*;  // utilize all code in the codehs package


public class UserInput extends ConsoleProgram{

    public void run() {
        // get name
        String name = readLine("Enter your name: ");
        // get age
        int age = readInt("Enter your age: ");
        //get current mark
        double currentMark = readDouble("Enter current mark: ");
        //get locker status
        boolean lockerAssigned = readBoolean("Have you been assigned a locker?(True/False): ");

        //output info
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Current Mark: " + currentMark);
        System.out.println("Locker Assigned: " + lockerAssigned);
    }
}

