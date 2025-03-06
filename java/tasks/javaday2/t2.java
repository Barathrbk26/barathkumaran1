import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        while (number != 0) {
            if (number % 10 == 0) {
                System.out.println("The number contains a 0.");
                sc.close(); // Close scanner before returning
                return; 
            }
            number /= 10; 
        }
        
        System.out.println("The number does not contain a 0.");
        sc.close(); // Properly close scanner at the end
    }
}
