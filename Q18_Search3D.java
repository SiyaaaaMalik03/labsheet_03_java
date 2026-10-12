import java.util.Scanner;

public class Q18_Search3D {
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

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] == key) {
                        System.out.println("Element " + key + " found at position [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }
        sc.close();
    }
}
