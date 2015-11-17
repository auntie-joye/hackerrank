package com.codingthrough.hackerrank.practice.java.collections;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Problem Statement:
 * Comparators are used to compare two objects to sort them.
 * This problem will test your knowledge on Java Comparators.
 * There are N players in a tournament. You will be given the
 * name of each player and his score. You need to sort the players
 * in decreasing order by score. If two players have the same score,
 * the one whose name is lexicographically larger should appear first.
 * Note: We have already provided you with the partially completed
 * code in the editor. Your task is to create the class Checker
 * which uses a comparator desc to sort the players.
 * A string is lexicographically smaller than another string if it
 * appears earlier in a standard dictionary. For example, "cat" is
 * lexicographically smaller than "dog", but larger than "cab" or "ca".
 * <p>
 * Input Format:
 * The first line contains an integer N, denoting the number of players.
 * The next N lines contain the name of a player and his score separated
 * by a space. Two players can have the same name. A name will consist of
 * lowercase English characters. The score of a player can range from 0 to 1000.
 * You don't need to worry about any other constraints.
 * <p>
 * Output Format:
 * Print each player and their space-separated score on a different line
 * according to the directions in the problem statement.
 * <p>
 * Sample Input:
 * 5
 * amy 100
 * david 100
 * heraldo 50
 * aakansha 75
 * aleksa 150
 * <p>
 * Sample Output:
 * aleksa 150
 * david 100
 * amy 100
 * aakansha 75
 * heraldo 50
 */
public class JavaComparator {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Player Player[] = new Player[n];

        for (int i = 0; i < n; i++) {
            Player[i] = new Player();
            Player[i].name = sc.next();
            Player[i].score = sc.nextInt();
        }

        Checker check = new Checker();
        Arrays.sort(Player, check.desc);
        for (Player player : Player) {
            System.out.printf("%s %s\n", player.name, player.score);
        }
    }

    static class Checker {
        Comparator<Player> desc = (a, b) -> {
            if (a.score == b.score) {
                return b.name.compareTo(a.name);
            }

            return a.score > b.score ? -1 : 1;
        };
    }

    static class Player {
        String name;
        int score;
    }
}
