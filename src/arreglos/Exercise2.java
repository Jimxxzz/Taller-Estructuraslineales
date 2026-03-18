public class Exercise2 {
    public static void main(String[] args) {
        int[] evens = new int[100];
        for (int i = 0; i < 100; i++) {
            evens[i] = 2 * (i + 1);
        }
        // Print in one line
        System.out.println("First 100 even numbers in one line:");
        for (int even : evens) {
            System.out.print(even + " ");
        }
        System.out.println();
        // Print in 10 lines
        System.out.println("First 100 even numbers in 10 lines:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Line " + (i + 1) + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(evens[i * 10 + j] + " ");
            }
            System.out.println();
        }
    }
}