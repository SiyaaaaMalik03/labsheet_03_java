import java.util.Scanner;

public class Q06_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] source = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            source[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            copy[i] = source[i];
        }

        System.out.print("Original array: ");
        for (int x : source) {
            System.out.print(x + " ");
        }
        System.out.print("\nCopied array  : ");
        for (int x : copy) {
            System.out.print(x + " ");
        }
        System.out.println();
        sc.close();
    }
}
