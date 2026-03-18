import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(2 * i);
        }
        System.out.println("Initial ArrayList:");
        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to insert: ");
        int num = sc.nextInt();
        // Insert in correct position (ascending order)
        int pos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > num) {
                pos = i;
                break;
            }
            pos = i + 1;
        }
        list.add(pos, num);
        System.out.println("After insertion:");
        System.out.println(list);

        System.out.print("Enter a value to remove: ");
        int remove = sc.nextInt();
        list.remove(Integer.valueOf(remove));
        System.out.println("After removal:");
        System.out.println(list);
        sc.close();
    }
}