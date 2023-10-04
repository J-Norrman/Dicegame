package com.Joel.Dicegame;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game, press 1 to start ");
        System.out.println("1: Start");
        System.out.println("Anything else: Exit");
        int gameStart = scanner.getScanner();
        if (gameStart == 1) {
            Game.game();
        } else {
            System.exit(1);
        }
    }
    static void rollDice(int diceCount, Player player) {
        Random ranNum = new Random();
        int total = 0;
        int diceRandom;
        for (int i = 0; i < diceCount; i++) {
            diceRandom = ranNum.nextInt(6)+1;
            total = total + diceRandom;
            System.out.print(diceRandom);
            System.out.print(" ");
        }
        System.out.println(" ");
        player.score = total;
    }
}
