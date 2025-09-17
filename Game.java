import java.util.Scanner;
import java.util.Set;

public class Game {
    private static final Set<Integer> INSTANT_WIN = Set.of(7, 11, 15, 21);
    // Include 13 in the instant-lose per spec
    private static final Set<Integer> INSTANT_LOSE = Set.of(10, 12, 13, 19, 20, 22, 23, 24);

    public enum Outcome { WIN, LOSE }

    public static Outcome play(Scanner sc) {
        Dice dice = new Dice();

        System.out.println("First roll: press Enter to roll");
        sc.nextLine();
        int[] r = dice.roll4();
        int sum = dice.sum(r);
        printRoll(r, sum);

        if (INSTANT_WIN.contains(sum)) {
            System.out.println("You win");
            return Outcome.WIN;
        }
        if (INSTANT_LOSE.contains(sum)) {
            System.out.println("You lose ");
            return Outcome.LOSE;
        }

        int point = sum;
        System.out.println("Point is " + point + ". Keep rolling until you win.");
        System.out.println("If you roll 13 any time, you lose.");

        while (true) {
            System.out.println("Press Enter to roll");
            sc.nextLine();
            r = dice.roll4();
            sum = dice.sum(r);
            printRoll(r, sum);

            if (sum == point) {
                System.out.println("You win!");
                return Outcome.WIN;
            }
            if (sum == 13) {
                System.out.println("Rolled 13. You lose");
                return Outcome.LOSE;
            }
        }
    }

    private static void printRoll(int[] r, int sum) {
        System.out.printf("You rolled: [%d, %d, %d, %d] -> sum = %d%n", r[0], r[1], r[2], r[3], sum);
    }
}
