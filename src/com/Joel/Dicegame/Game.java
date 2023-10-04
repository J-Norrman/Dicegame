package com.Joel.Dicegame;

import java.util.ArrayList;

import static com.Joel.Dicegame.Main.rollDice;

public class Game {
    static void game() {
        System.out.println("Enter player count: ");
        int playerCount = C_Scanner.getScanner().nextInt();
        ArrayList<Player> playerList = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Enter player " + (i + 1) + " name");
            playerList.add(new Player(C_Scanner.getScanner().next()));
        }
        System.out.println("How many dice are you playing with?");
        int diceCount = C_Scanner.getScanner().nextInt();
        System.out.println("How many rounds are you playing?");
        int roundCount = C_Scanner.getScanner().nextInt();
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
            ArrayList<Player> playerScores = new ArrayList<>();
            for (Player player : playerList) {
                if (player.score == winner.score) {
                    playerScores.add(player);
                }
            }
            if (playerScores.size() > 1) {
                System.out.println("The game is tied between players: ");
                for (Player player : playerScores) {
                    System.out.println(player.name + " ");
                }
                System.out.println(" ");
            } else {
                System.out.println("The winner is " + winner.name + " with a total score of: " + winner.score);
            }
            System.out.println("-----------------------------------------------------");
        }
    }
}
