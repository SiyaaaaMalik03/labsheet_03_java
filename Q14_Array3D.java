import java.util.Scanner;

public class Q14_Array3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 elements of the 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Elements of the 3-D array:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
