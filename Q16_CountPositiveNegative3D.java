import java.util.Scanner;

public class Q16_CountPositiveNegative3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter 8 elements of the 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                    if (arr[i][j][k] > 0) {
                        positive++;
                    } else if (arr[i][j][k] < 0) {
                        negative++;
                    } else {
                        zero++;
                    }
                }
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros            = " + zero);
        sc.close();
    }
}
