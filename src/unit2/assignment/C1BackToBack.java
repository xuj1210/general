package unit2.assignment;
import codehs.*;


public class C1BackToBack extends ConsoleProgram {

    public void run() {
        String userString = readLine("Enter a string: ");
        String lastLetter = userString.substring(userString.length());

        System.out.println(lastLetter + userString + lastLetter);
    }
}