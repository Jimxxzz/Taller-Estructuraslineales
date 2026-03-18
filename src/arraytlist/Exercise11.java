import java.util.Scanner;
import java.util.Random;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m (rows): ");
        int m = sc.nextInt();
        System.out.print("Enter n (cols): ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(100); // 0-99
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Enter number to find: ");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < m && !found; i++) {
            for (int j = 0; j < n && !found; j++) {
                if (matrix[i][j] == num) {
                    System.out.println("Found at position (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Number not found");
        }
        sc.close();
    }
}