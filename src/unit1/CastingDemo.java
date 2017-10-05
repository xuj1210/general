package unit1;
import codehs.*;

/**
 * A simple program demonstrating casting
 * author: J. Xu
 *
 */
public class CastingDemo extends ConsoleProgram{

    public void run() {

        // convert an int variable to double
        int myInt = 5;
        double myDouble = (double)myInt;
        System.out.println(myDouble);


        // convert a double to an int
        double myDouble2 = 5.0;
        int myInt2 = (int) myDouble2;
        System.out.println(myInt2);


        // Watch out for truncation
        // convert a double to an int
        double myDouble3 = 5.7;
        int myInt3 = (int) myDouble3;
        System.out.println(myInt3);


        // Casting in Division
        int xInt = 10;
        int yInt = 6;
        double divResult = xInt/yInt;  // truncation occurs here
        System.out.println("divResult = " + divResult);

        double divResult2 = (double)(xInt/yInt);  // truncation still occurs here
        System.out.println("divResult2 = " + divResult2);

        double divResult3 = (double)xInt/yInt;  // correct use of casting in division
        System.out.println("divResult3 = " + divResult3);

    }
}
