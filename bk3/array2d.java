import java.util.Scanner;  // Import Scanner class

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        int arr[][] = new int[4][4]; // 4x4 2D array

        // Taking input for the 2D array
        System.out.println("Enter 16 elements for the 4x4 array:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Displaying the 2D array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }

        sc.close();  // Close Scanner
    }
}
