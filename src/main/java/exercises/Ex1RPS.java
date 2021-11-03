package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * The Rock, paper, scissor game.
 * See https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors
 *
 * This is exercising smallest step programming (no methods needed)
 *
 * Rules:
 *
 *       -----------  Beats -------------
 *       |                              |
 *       V                              |
 *      Rock (1) --> Scissors (2) --> Paper (3)
 *
 */
public class Ex1RPS {

    public static void main(String[] args) {
        new Ex1RPS().program();
    }

    final Random rand = new Random();
    final Scanner sc = new Scanner(in);

    void program() {

        int maxRounds = 5;
        int human;          // Outcome for player
        int computer;       // Outcome for computer
        int result;         // Result for this round
        int round = 0;      // Number of rounds
        int total = 0;      // Final result after all rounds

        // All code here ... (no method calls)

        out.println("Welcome to Rock, Paper and Scissors");

        // TODO Write the game here. Use smallest step then surround with loop!!!!
        Map<String, Integer> map_string = new HashMap<>();
        map_string.put("Rock", 1);
        map_string.put("Paper", 2);
        map_string.put("Scissors", 3);

        Map<Integer, String> map_int = new HashMap<>();
        map_int.put(1, "Rock");
        map_int.put(2, "Paper");
        map_int.put(3, "Scissors");

        //Must be int!!!
        out.println("How many rounds do you want to play? > ");
        round = sc.nextInt();
        out.println("Alright we will play for" + round + " rounds!");

        for (int i = 0; i < round; i++) {
            out.println("What would you like to roll? (Rock, Paper, Scissors) > ");
            human = map_string.get(sc.next());
            //CPU ROLL
            computer = rand.nextInt(1,4);


            // Rock
            if (human == 1) {
                if (computer == 1) {
                    result = 0;
                } else if (computer == 2) {

                }
            } else if (human == 2) {

            } else if (human == 3) {

            }

        }

        out.println("Game over! ");
        if (total == 0) {
            out.println("Draw");
        } else if (total > 0) {
            out.println("Human won.");
        } else {
            out.println("Computer won.");
        }
    }
}
