package unit1.livehack1;
import codehs.*;

/**
 * A program which calculates the area of a regular octagon with the input of a length of one side.
 * author: Joshua Zhonghua Xu
 *
 */
public class LiveHackProblem1 extends ConsoleProgram{

    public void run() {
        // Get the side length from user
        double sideLength = readDouble("Enter the length of side a: ");

        // Calculate the area of the octagon
        double areaOctagon = (Math.sqrt(2) + 1) * Math.pow(sideLength, 2) * 2;

        // Print the answer
        System.out.println("The area of a regular octagon with side length " + sideLength + " is " + areaOctagon);

    }
}