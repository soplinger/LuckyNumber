package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner kbInput1 = new Scanner(System.in);
        System.out.println("Hello, what is your name?: ");
        String userName = kbInput1.nextLine();
        int userExit = 0;


        while(userExit == 0) {
            luckyNumber user = new luckyNumber();
            System.out.println("Hello, your lucky number is: " + user.perfectRandom(0));
            System.out.println("To exit press 0, to reprint the name press 1, to enter a new name press 2");
            userExit = kbInput1.nextInt();
            if (userExit == 1){
                System.out.println("Hello, your lucky number is: " + user.perfectRandom(0));
            }

            else {
                System.out.println("Okay, rebooting...");
            }
        }

    }
}