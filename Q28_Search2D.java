import java.util.Scanner;

public class Q28_Search2D {
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

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] == key) {
                    System.out.println("Element " + key + " found at row " + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the matrix.");
        }
        sc.close();
    }
}
