package unit2.livehack2;
import codehs.*;

/*
    A program which calculates the distance between the Athabasca Glacier and a nearby lodge
    per year.
    Author: Joshua Xu
 */

public class Livehack2Problem1 extends ConsoleProgram{

    public void run() {
        //Get futureYear and set initial distance
        int futureYear = readInt("Enter a year in the future: ");
        int distance = 800;

        //Create a table which outputs the distance and repeats until it reaches the future year provided
        for(int year = 2017; year <= futureYear; year++){
            System.out.println("Year : " + year + ", Glacier Edge Distance: " + distance);
            distance = distance + 7;

        }
    }
}