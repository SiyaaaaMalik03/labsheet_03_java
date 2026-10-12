import java.util.Scanner;

public class Q11_TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        int[][] t = new int[c][r];

        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                t[j][i] = m[i][j];
            }
        }

        System.out.println("Original matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
