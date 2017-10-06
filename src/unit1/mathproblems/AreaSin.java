package unit1.mathproblems;
import codehs.*;


public class AreaSin extends ConsoleProgram{

    public void run() {
        // Get sideA, sideB, contained angle
        double sideA = readDouble("Enter the length of the first side: ");
        double sideB = readDouble("Enter the length of the second side: ");
        double containedAngle = readDouble("Enter the degree of the contained angle: ");

        //Convert degrees to angles
        double radiansAngle = Math.toRadians(containedAngle);

        // Calculate the area of the triangle
        double area = (sideA * sideB * Math.sin(radiansAngle) / 2);

        //Output the answer
        System.out.println("The area of the triangle is " + area);

    }
}