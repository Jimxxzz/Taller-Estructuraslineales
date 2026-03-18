import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] original = new int[20];
        int[] inverted = new int[20];
        for (int i = 0; i < 20; i++) {
            original[i] = rand.nextInt(1000) + 1; // 1 to 1000
            inverted[i] = reverse(original[i]);
        }
        System.out.println("Original array:");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Inverted array:");
        for (int num : inverted) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}