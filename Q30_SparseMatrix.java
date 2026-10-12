import java.util.Scanner;

public class Q30_SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];

        System.out.println("Enter the elements:");
        int zeros = 0, nonZeros = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                if (m[i][j] == 0) {
                    zeros++;
                } else {
                    nonZeros++;
                }
            }
        }

        System.out.println("Zero elements     = " + zeros);
        System.out.println("Non-zero elements = " + nonZeros);

        if (zeros > nonZeros) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is NOT a sparse matrix.");
        }
        sc.close();
    }
}
