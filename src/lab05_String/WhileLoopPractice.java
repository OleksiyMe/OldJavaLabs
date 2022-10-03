package lab05_String;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to continue?");
        String a=input.nextLine().toLowerCase();

        while ( !(a.equals("yes")||a.equals("no")) ) {

            System.err.println("invalid entry.Try once more!");
            a=input.nextLine().toLowerCase();

        }




    }
}
