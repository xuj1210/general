package unit1.mathproblems;
import codehs.*;


public class Minutes extends ConsoleProgram{

    public void run() {
        // Get number of minutes
        int numberMinutes = readInt("Number of minutes: ");

        // Calculate number of days, hours, minutes
        int daysFinal = numberMinutes / 1440;
        int hoursFinal = (numberMinutes % 1440) / 60;
        int minutesFinal = (numberMinutes % 1440) % 60 % 60;

        // Output answers
        System.out.println(numberMinutes + " minutes is equal to " + daysFinal + " days " + hoursFinal + " hours and " + minutesFinal + " minutes.");

    }
}