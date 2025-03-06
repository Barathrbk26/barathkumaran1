import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input reading
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Close scanner to avoid resource leak
        scanner.close();
        
        int num = 1;

        // Outer loop to handle rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to handle printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            // Move to next line after each row is printed
            System.out.println();
        }
    }
}
