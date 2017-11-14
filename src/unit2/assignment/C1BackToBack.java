package unit2.assignment;
import codehs.*;


public class C1BackToBack extends ConsoleProgram {

    public void run() {
        //Get userString
        String userString = readLine("Enter a string: ");

        //Find the last letter of userString
        int stringLength = userString.length();
        String lastLetter = userString.substring(stringLength - 1);

        //Print the new string
        System.out.println(lastLetter + userString + lastLetter);
    }
}