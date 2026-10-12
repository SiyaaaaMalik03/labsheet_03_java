import java.util.Scanner;

public class Q20_StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
            System.out.println("Enter " + subjects + " marks:");
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMarks of students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
