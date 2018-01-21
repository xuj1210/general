import java.util.Scanner;

public class grade11CPT {

    static String[] roomNames;
    static String[] roomDescriptions;
    static int[][] roomDirections;
    static Scanner scan = new Scanner(System.in);
    static int roomIn = 0;

    public static void main(String[] args){
        roomNames = new String[]{"", "Entrance", "", "", "", "Vine Room", "Sun Lit Hallway", "Hidden Room", "Dead End", "Plant Room", "Cracked Room", "Bone Room", "", "Throne Room", "Statue Hallway", "Small Room", "", "Tree Hallway", "Ritual Room", "Chest Room", "", "Plain Room", "", ""};
        roomDescriptions[1] = "You are in a long lost jungle temple looking for the rumored chest of the ancient king. In order to plunder the goods, you must solve the password that unlocks the door to the room with the chest. Clues are within the various rooms. Good luck!";
        roomDescriptions[5] = "You are in a room full of vines, with hallways leading North and East. Which way do you go? (n / e):";
        roomDescriptions[6] = "This is a sun lit hallway, with passages leading North and East. Which way do you go? (n / e):";
        roomDescriptions[7] = "You find a note on the ground. It says, “The secret word is an adjective.” There are passages leading North and West. Which way do you go? (n / w):";
        roomDescriptions[8] = "This room is a dead end. However, there is a note on the ground. It reads, “The last letter of the password is ‘n’.” You may only go back to the last room you were in. (e):";
        roomDescriptions[9] = "You are in a large room with vegetation sprouting from the ground. There are doors leading North, East, South and West. Which way do you go? (n / e / s / w):";
        roomDescriptions[10] = "You are in a room with large cracks running along the walls and ceiling, with sunlight seeping through the cracks. There are doors leading North, East, South, and West. Which way do you go? (n / e / s / w):";
        roomDescriptions[11] = "There are skeletons scattered everywhere around the ground. “The password is one of the components of a unique arc within the sky that appears after rain.” There are doors to the North, South, and West. Which way do you go? (n / s / w):";
        roomDescriptions[13] = "There appears to be a throne in a corner of the room. There are areas to the North, East, and South. Which way do you go? (n / e / s):";
        roomDescriptions[14] = "You are in a hallway with statues everywhere. There are exits to the North, East, South, and West. Which way do you go? (n / e / s / w):";
        roomDescriptions[15] = "You are in a room much smaller than normal. To the North there is a door that is locked. It requires a password. There are also passages leading to the South and West. Which way do you go? (n / s / w):";
        roomDescriptions[17] = "You are in a hallway with a large tree in the center. Inscribed on the tree there is a message which reads, “The password can be used to represent life.” There are areas to the North, East, and South. Which way do you go? (n / e / s):";
        roomDescriptions[18] = "You are in what appears to be a communal area with ritual materials from the previous inhabitants. There is a large adorned door to the East which requires a password. There are also doors to the South and West. Which way do you go? (e / s / w):";
        roomDescriptions[19] = "You have made it to the Chest Room! You open the chest and take all the goods within. Congratulations explorer!\n";
        roomDescriptions[21] = "There is nothing within the room except a note which reads, “ruoloc.” You must return to the room you were in. (s):";

        roomDirections = new int[24][4];

        while(true){
            roomDescription(roomIn);
            break;
        }

    }

    public static void roomDescription(int roomNumber){
        System.out.println(roomNames[roomNumber]);
        System.out.println(roomDescriptions[roomNumber]);
    }

    public static void northChosen{

    }

    public static void eastChosen{

    }

    public static void southChosen{

    }

    public static void westChosen{

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

