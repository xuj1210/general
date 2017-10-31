package unit2.loopPractice;
import codehs.*;


public class CashMeOutside extends ConsoleProgram{

    public void run() {
        double productPrice, totalTax;
        double total = 0;
        int quantity;

        int numProducts = readInt("How many products do want to purchase? ");

        for(int counter = 1; counter <= numProducts; counter++){

            productPrice = readDouble("Enter the price of product " + counter + ": ");
            quantity = readInt("How many of this product do you want: ");
            total += productPrice * quantity;
        }

        totalTax = total * 1.13;
        System.out.println("The total with tax is $" + Math.round(totalTax * 100.0) / 100.0);
    }
}