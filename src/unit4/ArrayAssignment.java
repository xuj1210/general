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

        //after4()
        System.out.println("after4() Tests:");
        int[] after4Test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        after4(after4Test1);

        int[] after4Test2 = {4, 3, 2, 1, 10, 10, 20, 30, 70};
        after4(after4Test2);

        int[] after4Test3 = {10, 9, 8, 7, 6, 5, 4, 3};
        after4(after4Test3);

        System.out.println("");

        //acromatch()
        String[] acromatchTest1First = {"Young", "Men's", "Christian", "Association"};
        String[] acromatchTest1Second = {"You", "Moo", "Cow", "Alphabet"};
        acromatch(acromatchTest1First, acromatchTest1Second);

        String[] acromatchTest2First = {"U", "S", "o", "A"};
        String[] acromatchTest2Second = {"U", "S", "A"};
        acromatch(acromatchTest2First, acromatchTest2Second);

        String[] acromatchTest3First = {"Acromatch"};
        String[] acromatchTest3Second = {"Woo", "Zoo", "Boo"};
        acromatch(acromatchTest3First, acromatchTest3Second);
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

    public static void acromatch(String[] wordArray1, String[] wordArray2){
        boolean valid = true;
        for(int counter = 0; counter <= wordArray1.length - 1 || counter <= wordArray2.length - 1; counter ++) {
            if(wordArray1[counter].charAt(0) == wordArray2[counter].charAt(0)) {
                valid = true;
                counter++;
            }
            else if(wordArray1[counter].charAt(0) != wordArray2[counter].charAt(0)) {
                valid = false;
                break;
            }
        }
        System.out.println(valid);
    }

    public static void diagonal(int number){
        int[][] squareArray;
        squareArray = new int[number][number];
        int numberOutputted;
        int counter = number - 1;

        for(int index1 = 0; index1 < number; index1++){
            numberOutputted = 0;
            for(int index2 = 0; index2 < number; index2++){
                if(index2 == counter){
                    squareArray[index1][index2] = 1;
                    numberOutputted = 2;
                }else{
                    squareArray[index1][index2] = numberOutputted;
                }

                System.out.print(" " + squareArray[index1][index2]);
            }
            System.out.println("");
            counter--;
        }
    }
}


