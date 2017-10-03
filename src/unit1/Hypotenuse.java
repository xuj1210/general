package unit1;
import codehs.*;


public class Hypotenuse extends ConsoleProgram{

    public void run() {
        //Create sideA, sideB, sideC, hypotenuse variable
        double sideA;
        double sideB;
        double hypotenuse;
        double hypSqrd;

        //Get length values for sideA, sideB
        sideA = readDouble("What is the length of side A? ");
        sideB = readDouble("What is the length of side B? ");

        //Compute hypotenuse
        hypSqrd = Math.pow(sideA, 2) + Math.pow(sideB, 2);
        hypotenuse = Math.sqrt(hypSqrd);

        //Output hypotenuse
        System.out.println("The hypotenuse is " + hypotenuse);


    }
}