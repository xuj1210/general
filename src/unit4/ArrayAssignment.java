package unit4;

public class ArrayAssignment {
    public static void main(String[] args) {
        //shiftLeft3()
        System.out.println("shiftLeft3() Tests:");
        int[] shiftLeftTest1 = {1, 2, 3};
        shiftLeft3(shiftLeftTest1);

        int[] shiftLeftTest2 = {10, 10, 10};
        shiftLeft3(shiftLeftTest2);

        int[] shiftLeftTest3 = {9, 7, 8};
        shiftLeft3(shiftLeftTest3);
    }

    public static int[] shiftLeft3(int[] numberArray) {
        int firstNum = numberArray[0];
        int secondNum = numberArray[1];
        int thirdNum = numberArray[2];

        numberArray[0] = secondNum;
        numberArray[1] = thirdNum;
        numberArray[2] = firstNum;

        for (int i = 0; i < numberArray.length; i++){
            if (i == numberArray.length - 1){
                System.out.println(numberArray[i]);
                break;
            }
            System.out.print(numberArray[i] + ", ");
        }

        return numberArray;
    }
}

    public static int[] after4(int[] numberArray){

    }