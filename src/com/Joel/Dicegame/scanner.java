package com.Joel.Dicegame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class scanner {
    public static int getScanner() {
        int gameStart;
        Scanner newScanner = new Scanner(System.in);
        gameStart = newScanner.nextInt();
        return gameStart;
    }
public static int intScanner() {
        int intInput = 0;
        boolean intCheck = true;
        while(intCheck) {
            try{
                Scanner intScan = new Scanner(System.in);
                intInput = intScan.nextInt();
                if (intInput > 0) {
                    intCheck = false;
                }else {
                    System.out.println("A number greater than 0..");
                }
            }catch (InputMismatchException e) {
                System.out.println("Please enter a number, try again");
            }
        }
        return intInput;
    }
    public static String stringScanner() {
        Scanner stringSC = new Scanner(System.in);
        return stringSC.next();
    }
}
