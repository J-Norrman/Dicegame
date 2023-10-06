package com.Joel.Dicegame;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game, press 1 to start ");
        System.out.println("1: Start");
        System.out.println("Anything else: Exit");
        String gameStart = scanner.stringScanner();
        if (gameStart.equals("1")) {
            Game.game();
            System.out.println("Thank you for playing!");
        } else {
            System.out.println("Maybe next time...");
            System.exit(1);
        }
    }
}

