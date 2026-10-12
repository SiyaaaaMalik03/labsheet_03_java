import java.util.Scanner;

public class Q25_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of the square matrix: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int mainDiagonal = 0, secondaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonal += m[i][i];
            secondaryDiagonal += m[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal      = " + mainDiagonal);
        System.out.println("Sum of secondary diagonal = " + secondaryDiagonal);
        sc.close();
    }
}
