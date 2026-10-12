import java.util.Scanner;

public class Q09_RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];

        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += m[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }
        sc.close();
    }
}
