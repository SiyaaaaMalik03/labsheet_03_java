import java.util.Scanner;

public class Q13_MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] prod = new int[3][3];

        System.out.println("Enter 9 elements of the first 3 x 3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 9 elements of the second 3 x 3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    prod[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(prod[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
