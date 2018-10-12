package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner kbInput1 = new Scanner(System.in);
        System.out.println("Hello, what is your name?: ");
        String userName = kbInput1.nextLine();
        int userExit2 = 0;
        luckyNumber user = new luckyNumber();
        double rand1 = user.perfectRandom(0);

        System.out.println("Hello, " + userName + " your lucky number is: " + rand1);

        boolean userExit = false;
        while(userExit == false) {
            System.out.println("To exit press 0, to reprint the name press 1, to enter a new name press 2");
            userExit2 = kbInput1.nextInt();
            if (userExit2 == 2){
                System.out.println("Okay, rebooting...");
                System.out.println("Hello, what is your name?: ");
                userName = kbInput1.next();
                rand1 = user.perfectRandom(0);
                System.out.println("Hello, " + userName + " your lucky number is: " + rand1);
            }

            else if(userExit2 == 1)  {
                System.out.println("Hello, " + userName + " your lucky number is: " + rand1);
            }

            else if (userExit2 == 0){
                System.out.println("Goodbye, " + userName + "!");
                userExit = true;
            }
        }

    }
}