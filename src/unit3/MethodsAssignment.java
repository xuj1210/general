package unit3;

import java.util.InputMismatchException;

public class MethodsAssignment {
    public static void main(String[] args){
        System.out.println("reverse method:");
        reverseTest();
        System.out.println("");
        System.out.println("evenlySpaced method");
        evenlySpacedTest();
    }

    /**
     * @param word Word value
     * @return Reversed letter order of the word value
     */

    public static String reverse(String word){
        //Find length of word and define reversed
        int wordLength = word.length() - 1;
        String reversed = "";

        //Loop that adds onto reversed going backwards within the word
        for(int counter = wordLength; counter >= 0; counter--){
            reversed += word.charAt(counter);
        }
        return reversed;
    }

    public static void reverseTest() {
        System.out.println("Test 1:");
        System.out.println("reverse('hello')");
        System.out.println("Expected result: olleh");
        System.out.println("Actual result: " + reverse("hello"));

        System.out.println("Test 2:");
        System.out.println("reverse('computer')");
        System.out.println("Expected result: retupmoc");
        System.out.println("Actual result: " + reverse("computer"));

        System.out.println("Test 3:");
        System.out.println("reverse('school is cool')");
        System.out.println("Expected result: looc si loohcs");
        System.out.println("Actual result: " + reverse("school is cool"));
    }

    /**
     * @param num1 First integer input
     * @param num2 Second integer input
     * @param num3 Third integer input
     * @return If the three integers are evenly spaced; True or false
     */

    public static boolean evenlySpaced (int num1, int num2, int num3){
        if(num1 != (int)num1 || num2 != (int)num2 || num3 != (int)num3){
            throw new InputMismatchException("Invalid input. Must be integer values.");
        }
        //Define isTrue
        boolean isTrue = false;

        //Check if the numbers are evenly spaced and return true or false
            if(num1 - num2 == num2 - num3) {
                isTrue = true;
            }else if(num1 - num3 == num2 - num3) {
                isTrue = true;
            }else if(num3 - num1 == num2 - num3){
                isTrue = true;
            }else {
                isTrue = false;
            }

        //Stop program if input provided is not an integer

        return isTrue;
    }

    public static void evenlySpacedTest(){
        System.out.println("Test 1:");
        System.out.println("evenlySpaced(2, 4, 6)");
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + evenlySpaced(2, 4, 6));

        System.out.println("Test 2:");
        System.out.println("evenlySpaced(20, 2, 11)");
        System.out.println("Expected result: true");
        System.out.println("Actual result: " + evenlySpaced(20, 2, 11));

        System.out.println("Test 3:");
        System.out.println("evenlySpaced(y, e, s)");
        System.out.println("Expected result: false");
        try {
            System.out.println("Actual result: " + evenlySpaced("y", "e", "s"));
        }catch(InputMismatchException err){
            System.out.println(err.getMessage());
    }
    }
}


