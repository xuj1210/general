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

        System.out.println("");

        System.out.println("after4() Tests:");
        int[] after4Test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        after4(after4Test1);

        int[] after4Test2 = {4, 3, 2, 1, 10, 10, 20, 30, 70};
        after4(after4Test2);

        int[] after4Test3 = {10, 9, 8, 7, 6, 5, 4, 3};
        after4(after4Test3);
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
    public static void after4(int[] numberArray){
        int last4Index = 0;
        for(int index = numberArray.length - 1; index >= 0; index--){
            if(numberArray[index] == 4){
                last4Index = index;
                break;
            }
        }
        for (int i = last4Index + 1; i <= numberArray.length - 1; i++){
            if (i == numberArray.length - 1){
                System.out.println(numberArray[i]);
                break;
            }
            System.out.print(numberArray[i] + ", ");
        }
    }

}

