package unit2.strings;
import codehs.*;


public class MenuChoice extends ConsoleProgram{

    public void run() {

        System.out.println("Beverage Menu:");
        System.out.println("a. Coffee");
        System.out.println("b. Bottled Water");
        System.out.println("c. Chocolate Milk");

        char choice = readLine("Enter your choice: ").charAt(0);

        while(choice != 'a' && choice != 'b' && choice!= 'c'){
            System.out.println("Invalid input. Please try again");
            choice = readLine("Enter your choice: ").charAt(0);
        }
    System.out.println("Great Choice");
    }
}