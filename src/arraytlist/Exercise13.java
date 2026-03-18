import java.util.Scanner;
import java.util.Random;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        boolean symmetric = true;
        for (int i = 0; i < n && symmetric; i++) {
            for (int j = 0; j < n && symmetric; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }
            }
        }
        System.out.println("Is symmetric: " + symmetric);
        System.out.println("Corners:");
        System.out.println("Top-left: " + matrix[0][0]);
        System.out.println("Top-right: " + matrix[0][n-1]);
        System.out.println("Bottom-left: " + matrix[n-1][0]);
        System.out.println("Bottom-right: " + matrix[n-1][n-1]);
        sc.close();
    }
}