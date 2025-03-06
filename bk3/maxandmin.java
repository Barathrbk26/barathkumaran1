import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of roll numbers: ");
        int n = sc.nextInt();

        
        int[] rollno = new int[n];

        System.out.print("Enter " + n + " roll numbers : ");

        
        for (int i = 0; i < n; i++) {
            rollno[i] = sc.nextInt();
        }

        
        int max = rollno[0];
        int min = rollno[0];

        
        for (int i = 1; i < n; i++) {
            if (rollno[i] > max) {
                max = rollno[i]; 
            }
            if (rollno[i] < min) {
                min = rollno[i]; 
            }
        }

      
        System.out.println("Maximum Roll Number: " + max);
        System.out.println("Minimum Roll Number: " + min);

        sc.close();
    }
}
