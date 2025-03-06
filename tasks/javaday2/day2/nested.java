import java.util.Scanner;
public class nested {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int mark =sc.nextInt();

        if (mark >= 35) {
            System.out.println("Pass");
            if (mark >= 80) {
                System.out.println("Above 80");
                if (mark == 80) {
                    System.out.println("Above 100");
                }
            }
        } else {
            System.out.println("try next time");
        }

    }

}
