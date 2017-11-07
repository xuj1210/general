package unit2.strings;
import codehs.*;


public class Scramble extends ConsoleProgram{

    public void run() {
        //Get word input and find the value of the first letter of half the word
        String word = readLine("Enter a word: ");
        int halfValue = word.length() / 2;

        //Find the firstHalf and secondHalf
        String firstHalf = word.substring(0, halfValue);
        String secondHalf = word.substring(halfValue);

        //Output the halves and scrambled word
        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);
        System.out.println("Scrambled: " + secondHalf + firstHalf);

    }
}