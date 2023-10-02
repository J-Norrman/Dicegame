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
            System.out.println("How many dice are you playing with?");
            int diceCount = scanner.nextInt();
            System.out.println("How many rounds are you playing?");
            int roundCount = scanner.nextInt();
            for (int i = 0; i < roundCount; i++) {
                Player winner = null;
                for (Player player : playerList) {
                    rollDice(diceCount, player);
                    System.out.println(player.name + " rolled a total of: " + player.score);
                    if (winner == null) {
                        winner = player;
                    } else {
                        if (player.score > winner.score) {
                            winner = player;
                        }
                    }
                }
                ArrayList<Player> scoreBoard = new ArrayList<>();
                for (Player player : playerList) {
                    if (player.score == winner.score) {
                        scoreBoard.add(player);
                    }
                }
                if (scoreBoard.size() > 1) {
                    System.out.println("The game is tied between players: ");
                    for (Player player : scoreBoard) {
                        System.out.println(player.name + " ");
                    }
                    System.out.println(" ");
                } else {
                    System.out.println("The winner is " + winner.name + " with a total score of: " + winner.score);
                }
                System.out.println("-----------------------------------------------------");
            }
        } else {
            System.exit(1);
        }
    }
    private static void rollDice(int diceCount, Player player) {
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
