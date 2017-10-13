package unit1.livehack1;
import codehs.*;

/**
 * A program that converts a user inputted Fahrenheit temperature to Celsius Degrees
 * author: Joshua Zhonghua Xu
 *
 */
public class LiveHackProblem2 extends ConsoleProgram{

    public void run() {
        // Get fahrenheit input from user
        double fahrenheit = readDouble("Enter the temperature in fahrenheit: ");

        // Convert fahrenheit to celsius degrees
        double five = 5;
        double celsius = (fahrenheit - 32) * (five / 9);

        // Output the solution
        System.out.println("The temperature in celsius is " + celsius + " degrees.");


    }
}