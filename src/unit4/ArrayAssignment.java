package unit4;

public class ArrayAssignment {
    public static void main(String[] args) {
        //shiftLeft3()
        System.out.println(shiftLeft3(1, 2, 3));

    }

    public static int[] shiftLeft3(int num1, int num2, int num3) {
        int[] numberArray = {num1, num2, num3};

        int firstNum = num1;
        int secondNum = num2;
        int thirdNum = num3;

        numberArray[0] = secondNum;
        numberArray[1] = thirdNum;
        numberArray[2] = firstNum;
        System.out.println(numberArray);
        return numberArray;

    }
}