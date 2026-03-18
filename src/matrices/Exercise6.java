import java.util.ArrayList;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int num;
        do {
            num = rand.nextInt(21) - 10; // -10 to 10
            list.add(num);
        } while (num != 10);
        System.out.println("Numbers read:");
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        double average = (double) sum / list.size();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}