package unit2.strings;
import codehs.*;


public class Find extends ConsoleProgram{

    public void run() {
        //Get text and desired character
        String text = readLine("Enter your text: ");
        int character = readInt("Enter the character you want to find: ");

        //Find the character and output it
        System.out.println("The character is: " + text.substring(character, character + 1));

    }
}