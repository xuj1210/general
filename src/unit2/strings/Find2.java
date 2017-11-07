package unit2.strings;
import codehs.*;


public class Find2 extends ConsoleProgram{

    public void run() {
        //Get name input
        String name = readLine("Enter your full name: ");

        //Determine the firstName and lastName
        String firstName = name.substring(0 , name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" "));

        //Output the firstName and lastName
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
}