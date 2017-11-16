package unit2.assignment;
import codehs.*;


public class C2EveryNth extends ConsoleProgram {

    public void run() {
        String userString = readLine("Enter a string: ");
        int everyNth = readInt("Enter an integer: ");
        int letterCount = 0;

        for(int counter = 0; counter < userString.length(); counter += everyNth){
            System.out.print(userString.substring(letterCount, letterCount + 1));
            letterCount += everyNth;
        }
    }
}