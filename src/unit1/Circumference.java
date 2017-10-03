package unit1;
import codehs.*;


public class Circumference extends ConsoleProgram{

    public void run() {
        //What is the radius
        double radius = readDouble("What is the radius: ");

        //Calculate circumference
        double circumference = 2 * Math.PI * radius;

        //Output answer
        System.out.println("The circumference of the circle is " + circumference);

    }
}