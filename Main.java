import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Four-Dice Game");
        try (Scanner sc = new Scanner(System.in)) {
            Game.play(sc);
        }
        System.out.println("Thank you for playing!");
    }
}
