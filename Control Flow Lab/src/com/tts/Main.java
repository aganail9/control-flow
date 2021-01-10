package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scanner.next();
        System.out.println("Hello " + userName);

        System.out.println("Do you want to play a game with me?? (y/n)");
        String bn = scanner.next();
        if (bn.equals("n")) {
            System.out.println("Fine then... I didn't want to play anyway.");
        }
        if (bn.equals("y")) {
            System.out.println("Do you have a red car? (y/n)");
            String car = scanner.next();
            System.out.println("What is the name of you favorite pet?");
            String pet = scanner.next();
            int lot2 = pet.charAt(2);
            if (lot2 > 75) {
                lot2 = lot2 - 75;
            } else {
            }
            System.out.println("How old is your pet?");
            int petAge = scanner.nextInt();
            System.out.println("What is your lucky number?");
            int luckyNum = scanner.nextInt();
            System.out.println("What is the two-digit model year of your car?");
            int modNum = scanner.nextInt();
            int lot1 = luckyNum + modNum;
            if (lot1 > 75) {
                lot1 = lot1 - 75;
            } else {
            }
            int lot3 = petAge + luckyNum;
            if (lot3 > 75) {
                lot3 = lot3 - 75;
            } else {
            }
            System.out.println("What is the first name of your favorite actor or actress?");
            String favAct = scanner.next();
            int lot4 = favAct.charAt(0);
            if (lot4 > 75) {
                lot4 = lot4 - 75;
            } else {
            }
            System.out.println("Enter a random number between 1 and 50.");
            int ranNum = scanner.nextInt();
            System.out.println("Do you have a favorite quarterback? (y/n)");
            String favQB = scanner.next();
            if (favQB.equals("y")) {
                System.out.println("What is their jersey number?");
                int qbNum = scanner.nextInt();
                int magNum = qbNum;
                System.out.println("Your Lottery Numbers Are: 42 " + lot1 + "" + lot2 + "" + lot3 + "" + lot4 + " Magic Ball:" + magNum);
            } else {
                System.out.println("Yeah I don't watch or care about football either.");
                int magNum = luckyNum;
                System.out.println("Your Lottery Numbers Are:{ 42 " + lot1 + "" + lot2 + "" + lot3 + "" + lot4 + " Magic Ball:" + magNum);
            }
            System.out.println("Want to play again? (y/n)");
            String play = scanner.next();
            if ( play.equals("n")) {
                System.out.println("Okay thanks for playing!");
            }if ( play.equals("y")) {
                 Scanner input = new Scanner(System.in);
            }
        } else {
            System.out.println("ERROR");


        }
    }
}


