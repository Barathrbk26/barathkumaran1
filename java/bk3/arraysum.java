
import java.util.*;

public class arraysum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students (roll numbers): ");
        int n = sc.nextInt();

        int[] rollNumbers = new int[n];

        System.out.println("Enter the roll numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number " + (i + 1) + ": ");
            rollNumbers[i] = sc.nextInt();
        }

        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     sum += rollNumbers[i];
        // }
        System.out.println("\nEntered Roll Numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll Number " + (i + 1) + ": " + rollNumbers[i]);
        }
        sc.close();
    }
}
