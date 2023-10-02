package com.Joel.Dicegame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game, press 1 to start ");
        System.out.println("1. Start");
        System.out.println("2. Exit");
        Scanner scanner = new Scanner(System.in);
        int gameStart = scanner.nextInt();
        if (gameStart == 1) {
            System.out.println("Enter player count: ");
            int playerCount = scanner.nextInt();
            ArrayList<Player> playerList = new ArrayList<>();
            for (int i = 0; i < playerCount; i++) {
                System.out.println("Enter player " + (i+1) + " name");
                playerList.add(new Player(scanner.next()));
            }
        }
    }
    private static void rollDice(int diceCount, Player player) {
        Random ranNum = new Random();
        int total = 0;
        int diceRandom;

        for (int i = 0; i < diceCount; i++) {
            diceRandom = ranNum.nextInt(6)+1;
            total = total + diceRandom;
            System.out.println(diceRandom);
        }
    }
}
