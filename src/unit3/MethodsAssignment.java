package unit3;

import java.util.InputMismatchException;

public class MethodsAssignment {
    public static void main(String[] args){
    }

    /**
     *
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


    /**
     * @param num1 First integer input
     * @param num2 Second integer input
     * @param num3 Third integer input
     * @return If the three integers are evenly spaced; True or false
     */

    public static boolean evenlySpaced (int num1, int num2, int num3){
        //Define isTrue
        boolean isTrue = false;

        //Check if the numbers are evenly spaced and return true or false
        try{
            if(num2 - num1 == num3 - num2){
                isTrue = true;
            }else{
                isTrue = false;
            }

        //Stop program if input provided is not an integer
        }catch(InputMismatchException err){
            System.out.println("You must enter integers only." + err.getMessage());
        }

    //Return isTrue for the program to use
    return isTrue;
    }
}

