package unit1;   // EDIT: set to appropriate lesson unit for this program

import codehs.*;  // utilize all code in the codehs package


public class AvgMarks extends codehs.ConsoleProgram{

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

    }