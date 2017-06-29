import java.util.Scanner;

/**
 * For loop to output all numbers from the number entered down to 0.
 *
 * Created by kuwu on 2017/06/28.
 */
public class LoopTest {


    public void loopTestOneThree() {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scnr.nextInt();


        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }

    }

    public static char getUserInput() {
        Scanner scnr = new Scanner(System.in); // create a scanner object
        System.out.println("Enter 'y' to continue or 'n' to quit");
        // cast uppercase to lowercase
        String userInput = scnr.next().toLowerCase();

        return userInput.charAt(0);
    }

    public static void printUserInfo() {
        LoopTest check = new LoopTest();
        check.loopTestOneThree();
    }


    public static void main(String[] args) {
        char userChar;
        boolean value = true;


        // runs Factorial one time before continue/check loop
        printUserInfo();

// loop allows user to continue using 'y or Y' until the user
// types 'n or N' to quit    validates for 'y or Y' and 'n or N'
        do {
            userChar = getUserInput();
            if (userChar == 'y') {
                printUserInfo();
            } else if (userChar == 'n') {
                value = false;
            } else {
                System.out.println(userChar + " is not y or n please re-enter");
            }

        } while (value);


        // Informing the user the program has ended
        System.out.print("Goodbye");


    }
}


