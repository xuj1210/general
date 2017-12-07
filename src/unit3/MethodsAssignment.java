package unit3;

import java.util.InputMismatchException;

/*
A program that
 */
public class MethodsAssignment {
    public static void main(String[] args) {
        System.out.println("reverse Method Test:");
        reverseTest();
        System.out.println("");
        System.out.println("evenlySpaced Method Test:");
        evenlySpacedTest();
    }

    /**
     * Reverse the letters of a word
     * @param word Word value
     * @return Reversed letter order of the word value
     */
    public static String reverse(String word){
        //Throws code when provided value is nothing or a space
        if(word.equals("") || word.equals(" ")){
            throw new InputMismatchException("Invalid input. String value required");
        }

        //Find length of word and define string reversed
        int wordLength = word.length() - 1;
        String reversed = "";

        //Loop that adds onto reversed going backwards within the word
        for(int counter = wordLength; counter >= 0; counter--){
            reversed += word.charAt(counter);
        }
        return reversed;
    }

    /**
     * Test the reverse method
     */
    public static void reverseTest() {
        System.out.println("Test 1:");
        System.out.println("reverse('hello')");
        System.out.println("Expected result: olleh");
        System.out.println("Actual result: " + reverse("hello"));

        System.out.println("Test 2:");
        System.out.println("reverse(' ')");
        System.out.println("Expected result: Invalid input. String value required");
        try {
            System.out.println("Actual result: " + reverse(" "));
        }catch(InputMismatchException err){
            System.out.println("Actual result: Invalid input. String value required");
        }

        System.out.println("Test 3:");
        System.out.println("reverse('school is cool')");
        System.out.println("Expected result: looc si loohcs");
        System.out.println("Actual result: " + reverse("school is cool"));
    }

    /**
     * Check if three numbers are evenly spaced
     * @param num1 First integer input
     * @param num2 Second integer input
     * @param num3 Third integer input
     * @return If the three integers are evenly spaced; True or false
     */
    public static boolean evenlySpaced (int num1, int num2, int num3){
        //Throw the program if the values provided are not an integer
        if(num1 != (int)num1 || num2 != (int)num2 || num3 != (int)num3){
            throw new InputMismatchException("Invalid input. Must be integer values.");
        }

        //Define isTrue
        boolean isTrue;

        //Check if the numbers are evenly spaced and return true or false
        if(num1 - num2 == num2 - num3) {
            isTrue = true;
        }else if(num1 - num3 == num2 - num3) {
            isTrue = true;
        }else if(num3 - num1 == num2 - num3) {
            isTrue = true;
        }else {
            isTrue = false;
        }
        return isTrue;
    }

    /**
     * Test the evenlySpaced method
     */
    public static void evenlySpacedTest() {
        System.out.println("Test 1:");
        System.out.println("evenlySpaced(2, 10, 11)");
        System.out.println("Expected result: false");
        System.out.println("Actual result: " + evenlySpaced(2, 10, 11));

        System.out.println("Test 2:");
        System.out.println("evenlySpaced(20, 2, 11)");
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + evenlySpaced(20, 2, 11));

        System.out.println("Test 3:");
        System.out.println("evenlySpaced(1, -13, -6)");
        System.out.println("Expected result: true");
        try {
            System.out.println("Actual result: " + evenlySpaced(1, -13, -6));
        }catch(InputMismatchException err){
            System.out.println(err.getMessage());
        }
    }
}


