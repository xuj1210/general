package unit1.mathproblems;
import codehs.*;


public class Hours extends ConsoleProgram{

    public void run() {
        // Get number of hours
        int numberHours = readInt("Number of hours: ");
        // Calculate days and hours
        int daysTotal = numberHours / 24;
        int hoursTotal = numberHours % 24;
        // Output solutions
        System.out.println(numberHours + " hours is equal to " + daysTotal + " days and " + hoursTotal + " hours.");

    }
}