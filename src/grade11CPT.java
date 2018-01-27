import java.util.Scanner;
import java.util.InputMismatchException;

public class grade11CPT {

    static String[] roomNames;
    static String[] roomDescriptions;
    static int[][] roomDirections;
    static Scanner scan = new Scanner(System.in);
    static int currentRoom;
    static int nextRoom;
    static String userSelectedRoomStr;
    static boolean done = false;
    static int passwordAttempts = 0;
    static boolean passwordCorrect;
    static boolean hasKey;

    public static void main(String[] args){
        roomNames = new String[]{"", "Entrance", "", "", "", "Vine Room", "Sun Lit Hallway", "Hidden Room", "Dead End", "Plant Room", "Cracked Room", "Bone Room", "", "Trap Room", "Statue Hallway", "Small Room", "", "Tree Hallway", "Ritual Room", "Chest Room", "", "Plain Room", "", ""};
        roomDescriptions = new String[22];
        roomDescriptions[1] = "You are in a long lost jungle temple looking for the rumored chest of the ancient king. In order to plunder the goods, you must find a key located in one of the rooms\nwithin the temple. As well you must solve the password that unlocks the door to the room with the chest. Clues can be found within the various rooms. Good luck! Start by going North. (n): ";
        roomDescriptions[5] = "You are in a room full of vines, with hallways leading North and East.\nWhich way do you go? (n / e): ";
        roomDescriptions[6] = "This is a sun lit hallway, with passages leading North, East, and West.\nWhich way do you go? (n / e / w): ";
        roomDescriptions[7] = "You find a note on the ground. It says, “The secret word is an adjective.” There are no new passages.\nYou must go back west. (w): ";
        roomDescriptions[8] = "This room is a dead end. However, there is a note on the ground. It reads, “The last letter of the password is ‘n’.\nYou may only go back to the last room you were in. (e): ";
        roomDescriptions[9] = "You are in a large room with vegetation sprouting from the ground. There are doors leading East, South and West.\nWhich way do you go? (e / s / w): ";
        roomDescriptions[10] = "You are in a room with large cracks running along the walls and ceiling, with sunlight seeping through the cracks.\nThere are doors leading North, East, South, and West.\nWhich way do you go? (n / e / s / w): ";
        roomDescriptions[11] = "There are skeletons scattered everywhere around the ground. You also find the key and pick it up. There are doors to the North and West.\nWhich way do you go? (n / w): ";
        roomDescriptions[13] = "Congratulations! You correctly answered the password! There are doors leading to the north and east. Which way do you want to go? (n / e): ";
        roomDescriptions[14] = "You are in a hallway with statues everywhere. There are exits to the North, East, South, and West.\nWhich way do you go? (n / e / s / w): ";
        roomDescriptions[15] = "You are in a room much smaller than normal. There are passages leading to the South and West.\nWhich way do you go? (s / w): ";
        roomDescriptions[17] = "You are in a hallway with a large tree in the center. Inscribed on the tree there is a message which reads, “The password can be used to represent life.” There are areas to the North, East, and South.\nWhich way do you go? (n / e / s): ";
        roomDescriptions[18] = "You are in what appears to be a communal area with ritual materials from the previous inhabitants. There is a large adorned door to the East which requires a password. There are also doors to the South and West.\nWhich way do you go? (e / s / w): ";
        roomDescriptions[19] = "You have successfully guessed the password and made it into the Chest Room! You open the chest and take all the goods within. Congratulations explorer!";
        roomDescriptions[21] = "There is nothing within the room except a note which reads, “ruoloc a si ti”\nYou must return to the room you were in. (s):";

        roomDirections = new int[22][4];
        roomDirections[1] = new int[]{5, -1, -1, -1};
        roomDirections[5] = new int[]{9, 6, -1, -1};
        roomDirections[6] = new int[]{10, 7, -1, 5};
        roomDirections[7] = new int[]{-1, -1, -1, 6};
        roomDirections[8] = new int[]{-1, 9, -1, -1};
        roomDirections[9] = new int[]{-1, 10, 5, 8};
        roomDirections[10] = new int[]{14, 11, 6, 9};
        roomDirections[11] = new int[]{15, -1, -1, 10};
        roomDirections[13] = new int[]{17, 14, -1, -1};
        roomDirections[14] = new int[]{18, 15, 10, 13};
        roomDirections[15] = new int[]{-1, -1, 11, 14};
        roomDirections[17] = new int[]{21, 18, 13, -1};
        roomDirections[18] = new int[]{-1, 19, 14, 17};
        roomDirections[21] = new int[]{-1, -1, 17, -1};

        currentRoom = 1;

                while (!done && passwordAttempts < 3 ) {
                    roomDescription(currentRoom);
                    done = endCheck(currentRoom);
                    userSelectedRoomStr = userInput();
                    System.out.println("");

                    if (userSelectedRoomStr.equalsIgnoreCase("n")) {
                        nextRoom = roomDirections[currentRoom][0];
                        if (nextRoom == -1) {
                            System.out.println("Invalid direction, you can not go there.");
                            System.out.println("");
                        } else {
                            currentRoom = nextRoom;
                        }
                    } else if (userSelectedRoomStr.equalsIgnoreCase("e")) {
                        nextRoom = roomDirections[currentRoom][1];
                        if (nextRoom == -1) {
                            System.out.println("Invalid Direction. You can not go there.");
                            System.out.println("");
                        } else if (nextRoom == 19) {
                            passwordChecker();
                            System.out.println("");
                            if (passwordCorrect && hasKey) {
                                currentRoom = nextRoom;
                                roomDescription(currentRoom);
                                break;
                            } else if (passwordCorrect && !hasKey){
                                System.out.println("You opened the door but you do not have the key for the chest! Keep looking around the temple to find the key.");
                                System.out.println("");
                            } else if (passwordAttempts < 2) {
                                currentRoom = 18;
                                System.out.println("You got the password wrong. " + (2 - passwordAttempts) + " attempt(s) left. Look around the temple for more clues.");
                                System.out.println("");
                                passwordAttempts++;
                            } else {
                                System.out.println("You got the password incorrect too many times and the temple began to crumble, forcing you to evacuate.\nBetter luck next time!");
                                done = true;
                            }
                        } else if (nextRoom == 11) {
                            currentRoom = nextRoom;
                            hasKey = true;
                        } else {
                            currentRoom = nextRoom;
                        }
                    } else if (userSelectedRoomStr.equalsIgnoreCase("s")) {
                        nextRoom = roomDirections[currentRoom][2];
                        if (nextRoom == -1) {
                            System.out.println("Invalid input. You cannot go there.");
                            System.out.println("");
                        } else if (nextRoom == 11) {
                            currentRoom = nextRoom;
                            hasKey = true;
                        } else if (nextRoom == 13){
                            boolean riddleAnswered = trapRoom();

                            if (riddleAnswered) {
                                currentRoom = nextRoom;
                            } else {
                                break;
                            }
                        } else {
                            currentRoom = nextRoom;
                        }
                    } else if (userSelectedRoomStr.equalsIgnoreCase("w")){
                        nextRoom = roomDirections[currentRoom][3];
                        if (nextRoom == -1) {
                            System.out.println("Invalid input. You cannot go there.");
                            System.out.println("");
                        } else if (nextRoom == 13) {
                            boolean riddleAnswered = trapRoom();

                            if(riddleAnswered) {
                                currentRoom = nextRoom;
                            } else {
                                break;
                            }
                        } else {
                            currentRoom = nextRoom;
                        }
                    } else {
                        System.out.println("Invalid input. You cannot go there.");
                        System.out.println("");
                    }
                }

            System.out.println("");

        }


    public static void roomDescription(int currentRoom){
        System.out.println(roomNames[currentRoom]);
        System.out.println(roomDescriptions[currentRoom]);
    }

    public static String userInput(){
        return scan.nextLine();
    }

    public static boolean endCheck(int roomNumber){
        if(roomNumber == 19){
            done = true;
        }
        return done;
    }

    public static boolean passwordChecker(){
        String userGuess;
        System.out.println("What is the password: ");
        userGuess = scan.nextLine();
        if(userGuess.equalsIgnoreCase("green")){
            passwordCorrect = true;
        }
        else{
            passwordCorrect = false;
        }

        return passwordCorrect;
    }

    public static boolean trapRoom(){
        boolean escaped = false;
        String userAnswer;
        int riddleAttempts = 0;
        System.out.println("Uh oh! You are in the trap room! On the walls, there are writings which say, 'In order to escape, you must solve the following riddle:\nMy rings are not worth much, but they do tell my age. What am I?: ' ");
        while(riddleAttempts < 3) {
            userAnswer = userInput();

            if (userAnswer.equalsIgnoreCase("tree")) {
                escaped = true;
                currentRoom = nextRoom;
                break;
            } else if (riddleAttempts <= 1) {
                System.out.println("Nothing happened. Looks like you got the password wrong. You have " + (2 - riddleAttempts) + " attempt(s) left.");
                riddleAttempts++;
            } else {
                System.out.println("You failed to solve the riddle correctly in the allotted attempts, and the temple crashed around you. Better luck next time!");
                break;
            }
        }
        return escaped;
    }

}

