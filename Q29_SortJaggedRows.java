import java.util.Scanner;

public class Q29_SortJaggedRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int[][] jagged = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int len = sc.nextInt();
            jagged[i] = new int[len];
            System.out.println("Enter " + len + " elements:");
            for (int j = 0; j < len; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        // Bubble sort each row in ascending order
        for (int i = 0; i < rows; i++) {
            int len = jagged[i].length;
            for (int p = 0; p < len - 1; p++) {
                for (int q = 0; q < len - 1 - p; q++) {
                    if (jagged[i][q] > jagged[i][q + 1]) {
                        int temp = jagged[i][q];
                        jagged[i][q] = jagged[i][q + 1];
                        jagged[i][q + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Jagged array after sorting each row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
