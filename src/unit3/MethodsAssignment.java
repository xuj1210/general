package unit3;

import java.util.InputMismatchException;

public class MethodsAssignment {
    public static void main(String[] args){
        System.out.println("Test 1: Inputs: 1, 2, 3");
        System.out.println("Expected result: True");
        System.out.println("Actual result: " + evenlySpaced(1, 2, 3));
    }

    public static boolean evenlySpaced (int num1, int num2, int num3){
        //Define isTrue
        boolean isTrue = false;

        //
        try{
            if(num2 - num1 == num3 - num2){
                isTrue = true;
            }else{
                isTrue = false;
            }
        }catch(InputMismatchException i){
            System.out.println("Must input integers only. " + i.getMessage());
        }
    return isTrue;
    }
}

