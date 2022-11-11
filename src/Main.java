import java.awt.dnd.InvalidDnDOperationException;
import java.util.Scanner;

//2. Find out if a word is a palindrome

public class Main {
    public static void main(String[] args) {

        Scanner nameIn = new Scanner(System.in);  // Scanner object for user input
        System.out.println("Input a word for check:  ");
        String checkName = nameIn.nextLine();  // Read user input
        checkName = checkName.toLowerCase();

        for (int indexPosition = 0; indexPosition < checkName.length(); indexPosition++) {
            char letterPosForward = checkName.charAt(indexPosition);
            int backwardIndex = checkName.length() - 1 - (indexPosition);
            char letterPosBackwards = checkName.charAt(backwardIndex);
            System.out.println(letterPosBackwards + " --- " + letterPosBackwards);
            if (letterPosForward == letterPosBackwards) {
                System.out.println(checkName + " is palindrome.");
            } else {
                System.out.println( checkName + " is not palindrome.");
                break;
            }
        }

    }
}