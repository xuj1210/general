package unit1;
import codehs.*;

public class AvgMarks extends ConsoleProgram{

    public void run() {

        //CREATE mark1,mark2,mark3,mark4
        double mark1, mark2, mark3, mark4;

        mark1 = readDouble("Enter the first mark: ");
        mark2 = readDouble("Enter the second mark: ");
        mark3 = readDouble("Enter the third mark: ");
        mark4 = readDouble("Enter the fourth mark: ");

        double avg = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println("Your average is " + avg);

      }

    public static class Hours extends ConsoleProgram{

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

    public static class Minutes extends ConsoleProgram{

        public void run() {
            // Get number of minutes
            int numberMinutes = readInt("Number of minutes: ");

            // Calculate number of days, hours, minutes
            int daysFinal = numberMinutes / 1440;
            int hoursFinal = (numberMinutes % 1440) / 24;
            int minutesFinal = (numberMinutes % 1440) / 60;

            // Output answers
            System.out.println(numberMinutes + " is equal to " + daysFinal + " days " + hoursFinal + " hours and " + minutesFinal + " minutes.");

        }
    }
}