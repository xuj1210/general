package unit1;
import codehs.*;


public class Cos3rd extends ConsoleProgram{

    public void run() {
    //Get sideA, sideB, contained angle
    double sideA = readDouble("What is the length of the first side? ");
    double sideB = readDouble("What is the length of the second side? ");
    double angle = readDouble("What is the degree of the contained angle? ");

    //Calculate sideC
    double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - (sideA * sideB * Math.cos(angle)) * 2) ;

    //Output answer
    System.out.println("The length of the third side is " + sideC);
    }
}