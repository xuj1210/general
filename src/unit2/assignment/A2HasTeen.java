package unit2.assignment;
import codehs.*;


public class A2HasTeen extends ConsoleProgram {

    public void run() {
        int teenAgeInput1 = readInt("Enter an age: ");
        int teenAgeInput2 = readInt("Enter an age: ");
        int teenAgeInput3 = readInt("Enter an age: ");

        if(teenAgeInput1 >= 13 && teenAgeInput1 <= 19) {
            System.out.println("True");
        }
        else if(teenAgeInput2 >= 13 && teenAgeInput2 <= 19){
            System.out.println("True");
        }

        else if(teenAgeInput3 >= 13 && teenAgeInput3 <= 19) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}