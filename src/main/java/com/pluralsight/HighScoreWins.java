/*
 Prompts the user to enter team and score information of an event.
 The input will be a single string that contains both team names and
 the final score of the match
 */
package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter team score and info of an event
        System.out.print("Please enter a game score: ");
        String gameScore = scanner.nextLine();

        // Split the string into a string of teams and a string of scores
        String[] teamsAndScores = gameScore.split("\\|");

        // Split teams into separate strings and scores into separate strings
        String[] teams = teamsAndScores[0].split(":");
        String [] scores = teamsAndScores[1].split(":");

        // Convert string values into integer variables
        int scoreTeam1 = Integer.parseInt(scores[0]);
        int scoreTeam2 = Integer.parseInt(scores[1]);

        // Compare the scores to determine a winner
        if(scoreTeam1 > scoreTeam2){
            System.out.print("Winner: " + teams[0]);
        }
        else
            System.out.print("Winner: " + teams[1]);

    }
}
