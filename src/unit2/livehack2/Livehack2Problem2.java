package unit2.livehack2;
import codehs.*;

/*
    A program which calculates the year when the lodge will close after the glacier has receded to much
    Author: Joshua Xu
 */

public class Livehack2Problem2 extends ConsoleProgram{

    public void run() {
        //Initialize the currentDistance, currentYear, and the distance when the lodge will close
        int currentDistance = 800;
        int currentYear = 2017;
        int yearClosedDistance = 800 * 2;

        //Adds 7 to the currentDistance and 1 to currentYear until currentDistance has doubled
        while(currentDistance != yearClosedDistance){
            if(currentDistance <= yearClosedDistance){
                currentDistance += 7;
                currentYear++;
            }
            else{
                break;
            }

        }
        //Output the year when the lodge will close
        System.out.println("The year the lodge will close is " + currentYear);
    }
}