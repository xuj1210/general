package unit4;

/*
A program which tests four methods; shiftLeft3(), after4(), acromatch(), and diagonal()
Author: Joshua Xu
 */

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
        System.out.println("acromatch() Tests:");
        String[] acromatchTest1First = {"Young", "Men's", "Christian", "Association"};
        String[] acromatchTest1Second = {"You", "Moo", "Cow", "Alphabet"};
        acromatch(acromatchTest1First, acromatchTest1Second);

        String[] acromatchTest2First = {"U", "S", "o", "A"};
        String[] acromatchTest2Second = {"U", "S", "A"};
        acromatch(acromatchTest2First, acromatchTest2Second);

        String[] acromatchTest3First = {"Acromatch"};
        String[] acromatchTest3Second = {"Woo", "Zoo", "Boo"};
        acromatch(acromatchTest3First, acromatchTest3Second);

        System.out.println("");


        //diagonal()
        System.out.println("diagonal() Tests:");
        diagonal(3);
        System.out.println("");

        diagonal(5);
        System.out.println("");

        diagonal(8);
    }

    /**
     * Shifts the numbers in an array with a length of three to the left
     * @param numberArray The inputted array
     * @return The array with the shifted numbers
     */
    public static int[] shiftLeft3(int[] numberArray) {
        //Store the three numbers in the array as variables
        int firstNum = numberArray[0];
        int secondNum = numberArray[1];
        int thirdNum = numberArray[2];

        //Set the individual parts of the array as the desired number
        numberArray[0] = secondNum;
        numberArray[1] = thirdNum;
        numberArray[2] = firstNum;

        //Outputs the new array that is made
        for (int i = 0; i < numberArray.length; i++){
            if (i == numberArray.length - 1){
                System.out.println(numberArray[i]);
                break;
            }
            System.out.print(numberArray[i] + ", ");
        }

        return numberArray;
    }

    /**
     * Outputs a new array with all the numbers after the last four in the original array
     * @param numberArray The inputted array
     */
    public static void after4(int[] numberArray){
        //Define index variable
        int last4Index = 0;

        //For loop that finds at what index the last 4 in the array is
        for(int index = numberArray.length - 1; index >= 0; index--){
            if(numberArray[index] == 4){
                last4Index = index;
                break;
            }
        }

        //For loop that prints out the numbers that are after the last 4 in the array
        for (int i = last4Index + 1; i <= numberArray.length - 1; i++){
            if (i == numberArray.length - 1){
                System.out.println(numberArray[i]);
                break;
            }
            System.out.print(numberArray[i] + ", ");
        }
    }

    /**
     * Checks whether two given string arrays form the same acronym
     * @param wordArray1 First string array
     * @param wordArray2 Second string array
     */
    public static void acromatch(String[] wordArray1, String[] wordArray2){
        //Define boolean valid
        boolean valid = true;

        //For loop which checks if the first letters of each equivalent part of two different arrays are the same
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

    /**
     * Outputs a two-dimensional array consisting of a diagonal of ones, ones on the left of the diagonal, and
     * twos on the right of the diagonal
     * @param number The length and width of the two-dimensional array
     */
    public static void diagonal(int number){
        //Create the array with the dimensions of the inputted number
        int[][] squareArray;
        squareArray = new int[number][number];

        int numberOutputted;
        int counter = number - 1;

        //Nested for loop which prints out the two-dimensional array
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


