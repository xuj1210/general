package unit3;

import java.util.InputMismatchException;

public class MethodsAssignment {
    public static void main(String[] args){
        System.out.println("Test 1:");
        evenlySpaced(1, 2, 3);
    }

    public static boolean evenlySpaced (int num1, int num2, int num3){
        boolean isTrue = false;
        try{
            if(num2 - num1 == num3 - num2){
                isTrue = true;
            }else{
                isTrue = false;
            }
        }catch(InputMismatchException i){
            System.out.println("Are the numbers evenly spaced: " + i.getMessage());
        }
    return isTrue;
    }
}

