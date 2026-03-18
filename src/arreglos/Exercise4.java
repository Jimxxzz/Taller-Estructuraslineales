import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[25];
        for (int i = 0; i < 25; i++) {
            arr[i] = rand.nextInt(101) - 50; // -50 to 50
        }
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Min: " + min + ", Max: " + max);
    }
}