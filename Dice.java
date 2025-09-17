import java.util.Random;

public class Dice {
    private final Random rand = new Random();

    public int[] roll4() {
        int[] r = new int[4];
        for (int i = 0; i < 4; i++) {
            r[i] = rand.nextInt(6) + 1; // 1..6
        }
        return r;
    }

    public int sum(int[] r) {
        int s = 0;
        for (int v : r) s += v;
        return s;
    }
}
