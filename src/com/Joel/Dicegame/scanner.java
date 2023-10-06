package com.Joel.Dicegame;
import java.util.InputMismatchException;
import java.util.Scanner;

public class scanner {

    public static int intScanner() {
        int intInput = 0;
        boolean intCheck = true;
        while(intCheck) {
            try {
                Scanner intScan = new Scanner(System.in);
                intInput = intScan.nextInt();
                if (intInput > 0) {
                    intCheck = false;
                } else {
                    System.out.println("A number greater than 0..");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number, try again.");
            }
        }
        return intInput;
    }
    public static String stringScanner() {
        String stringInput = null;
        boolean stringCheck = true;
        while (stringCheck){
            try {
                Scanner stringScan = new Scanner(System.in);
                stringInput = stringScan.nextLine();
                stringCheck = false;
            } catch (InputMismatchException e) {
                System.out.println("Please use a valid symbol, try again.");
            }
        }
        return stringInput;
    }
}
