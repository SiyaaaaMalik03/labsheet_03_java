import java.util.Scanner;

public class Q22_ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] counted = new boolean[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            if (counted[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
        sc.close();
    }
}
