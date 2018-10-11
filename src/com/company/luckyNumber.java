package com.company;

/**
 * Created by so367 on 10/9/18.
 */
public class luckyNumber {
    public double randNum;

    public double perfectRandom(double L){
        randNum = (int)(Math.random()*100);
        L = Math.pow(randNum, 2);
        return L;

    }
}

