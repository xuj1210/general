package unit1.mathproblems;
import codehs.*;


public class Rads extends ConsoleProgram{

    public void run() {
        // Get degrees
        double degrees = readDouble("What is the number of degrees? ");

        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        // Output answer
        System.out.println(degrees + " degrees is equal to " + radians + " radians.");

    }
}