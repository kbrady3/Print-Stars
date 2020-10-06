//Kabrina Brady

import java.util.Scanner;

public class PrintStarsBrady {
    public static void main(String[] args) {
        int numStars;
        Scanner input = new Scanner(System.in);

        System.out.println("How many rows of stars would you like to print?");
        numStars = input.nextInt();

        //Validation check
        if (numStars < 0){
            System.out.println("Enter a valid number.");
        }
        //Executes if numStars is greater than -1
        else {
            do {
                System.out.println("******");
                numStars--;
            }
            while (numStars > 0);
        }
    }
}