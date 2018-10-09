package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner kbInput1 = new Scanner(System.in);

        System.out.println("Hello, what is your name?: ");

        String userName = kbInput1.nextLine();

        luckyNumber luckyName = new luckyNumber(userName);

        System.out.println("Hello " + userName + ", how are you?");
        System.out.println("I have created a random number for you " + userName + " ! ");
        System.out.println(luckyName);

    }
}
