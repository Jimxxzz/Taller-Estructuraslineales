import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100) + 1); // 1 to 100
        }
        System.out.println("Original list:");
        System.out.println(list);

        // Sort ascending
        Collections.sort(list);
        System.out.println("Sorted ascending:");
        System.out.println(list);

        // Sort descending
        Collections.reverse(list);
        System.out.println("Sorted descending:");
        System.out.println(list);

        // Separate even and odd
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }
        System.out.println("Evens:");
        System.out.println(evens);
        System.out.println("Odds:");
        System.out.println(odds);
    }
}