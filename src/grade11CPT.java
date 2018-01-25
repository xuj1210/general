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

    public static void main(String[] args){
        roomNames = new String[]{"", "Entrance", "", "", "", "Vine Room", "Sun Lit Hallway", "Hidden Room", "Dead End", "Plant Room", "Cracked Room", "Bone Room", "", "Throne Room", "Statue Hallway", "Small Room", "", "Tree Hallway", "Ritual Room", "Chest Room", "", "Plain Room", "", ""};
        roomDescriptions = new String[22];
        roomDescriptions[1] = "You are in a long lost jungle temple looking for the rumored chest of the ancient king. In order to plunder the goods, you must solve the password that unlocks the door to the room with the chest.\n" + "Clues can be found within the various rooms. Good luck! Start by going North. (n): ";
        roomDescriptions[5] = "You are in a room full of vines, with hallways leading North and East.\nWhich way do you go? (n / e): ";
        roomDescriptions[6] = "This is a sun lit hallway, with passages leading North, East, and West.\nWhich way do you go? (n / e / w): ";
        roomDescriptions[7] = "You find a note on the ground. It says, “The secret word is an adjective.” There are no new passages.\nYou must go back west. (w): ";
        roomDescriptions[8] = "This room is a dead end. However, there is a note on the ground. It reads, “The last letter of the password is ‘n’.\nYou may only go back to the last room you were in. (e): ";
        roomDescriptions[9] = "You are in a large room with vegetation sprouting from the ground. There are doors leading East, South and West.\nWhich way do you go? (e / s / w): ";
        roomDescriptions[10] = "You are in a room with large cracks running along the walls and ceiling, with sunlight seeping through the cracks. There are doors leading North, East, South, and West.\nWhich way do you go? (n / e / s / w): ";
        roomDescriptions[11] = "There are skeletons scattered everywhere around the ground. “The password is one of the components of a unique arc within the sky that appears after rain.” There are doors to the North and West.\nWhich way do you go? (n / w): ";
        roomDescriptions[13] = "There appears to be a throne in a corner of the room. There are areas to the North and East.\nWhich way do you go? (n / e): ";
        roomDescriptions[14] = "You are in a hallway with statues everywhere. There are exits to the North, East, South, and West.\nWhich way do you go? (n / e / s / w): ";
        roomDescriptions[15] = "You are in a room much smaller than normal. There are passages leading to the South and West.\nWhich way do you go? (s / w): ";
        roomDescriptions[17] = "You are in a hallway with a large tree in the center. Inscribed on the tree there is a message which reads, “The password can be used to represent life.” There are areas to the North, East, and South.\nWhich way do you go? (n / e / s): ";
        roomDescriptions[18] = "You are in what appears to be a communal area with ritual materials from the previous inhabitants. There is a large adorned door to the East which requires a password. There are also doors to the South and West.\nWhich way do you go? (e / s / w): ";
        roomDescriptions[19] = "You have made it to the Chest Room! You open the chest and take all the goods within. Congratulations explorer!";
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

        int currentRoom = 1;
        while(!done){
            roomDescription(currentRoom);
            endCheck(currentRoom);
            try {
                userSelectedRoomStr = (userInput());

                if (userSelectedRoomStr.equals("n")) {
                    currentRoom = roomDirections[currentRoom][0];
                    if(currentRoom == -1){
                        throw new InputMismatchException("Invalid Direction. You can not go there.");
                    }
                } else if (userSelectedRoomStr.equals("e")) {
                    currentRoom = roomDirections[currentRoom][1];
                    if(currentRoom == -1){
                        throw new InputMismatchException("Invalid Direction. You can not go there.");
                    }
                } else if (userSelectedRoomStr.equals("s")) {
                    currentRoom = roomDirections[currentRoom][2];
                    if(currentRoom == -1){
                        throw new InputMismatchException("Invalid Direction. You can not go there.");
                    }
                } else {
                    currentRoom = roomDirections[currentRoom][3];
                    if(currentRoom == -1){
                        throw new InputMismatchException("Invalid Direction. You can not go there.");
                    }
                }
            }catch(InputMismatchException invalidDirection){
                System.out.println(invalidDirection);
            }
            System.out.println("");
        }

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

    public static boolean passwordChecker(String userGuess){
        boolean passwordCorrect;

        userGuess = scan.nextLine();
        if(userGuess == "green"){
            passwordCorrect = true;
        }
        else{
            passwordCorrect = false;
        }

        return passwordCorrect;
    }

}

