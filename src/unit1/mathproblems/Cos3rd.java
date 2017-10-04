package unit1.mathproblems;
import codehs.*;


public class Cos3rd extends ConsoleProgram{

    public void run() {
        // Get sideA, sideB, contained angle
        double sideA = readDouble("Enter the length of the first side: ");
        double sideB = readDouble("Enter the length of the second side: ");
        double containedAngle = readDouble("Enter the measure of the contained angle: ");

        // Convert angle to radians
        double radianAngle = Math.toRadians(containedAngle);

        // Calculate third side length
        double beforeSqrt = Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(radianAngle);
        double sideC = Math.sqrt(beforeSqrt);

        // Output answer
        System.out.println("The length of the third side is " + sideC);
    }
}