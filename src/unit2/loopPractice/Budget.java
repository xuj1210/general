package unit2.loopPractice;
import codehs.ConsoleProgram;

/**
 * Write a program Budget that prompts the user for a school supplies budget
 * value in dollars.  It will then ask the user to enter the name, unit price
 * and quantity of an item and output the remaining budget dollars until they’ve
 * spent more than their set budget.
 *
 * @author eric fabroa
 */
public class Budget extends ConsoleProgram {

    public void run(){
        double budget;

        String itemName;
        double itemPrice;
        int itemQty;

        budget = readDouble("Enter your school supplies budget: ");

        while(budget > 0){
            itemName = readLine("Enter an item to buy: ");
            itemPrice = readDouble("Enter the unit price of the item: ");
            itemQty = readInt("Enter the quantity of the item: ");

            budget = budget - (itemPrice * itemQty);

            System.out.println("You have " + budget + " left in your budget.");
        }

    }

}