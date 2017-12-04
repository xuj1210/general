package unit3;

import java.util.InputMismatchException;

public class MethodsAssignment {
    public static void main(String[] args){
        System.out.println("Test 1: Inputs: 1, 2, 3");
        System.out.println("Expected result: True");
        System.out.println("Actual result: " + evenlySpaced(1, 2, 3));
    }

    public static int lcm(int num1, int num2){
        int lcm;
        if(num1 > num2){
            for(int counter = 1; counter <= num2; counter++){
                if(num1 % counter == 0 && num2 % counter == 0){
                    lcm = counter;
                }
            }
        }
    }

    /**
     *
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
        }catch(InputMismatchException i){
            System.out.println("Must input integers only. " + i.getMessage());
        }

    //Return isTrue for the program to use
    return isTrue;
    }
}

