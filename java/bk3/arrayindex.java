
import java.util.Scanner;

public class arrayindex {

    public static void main(String[] args) {

        int arr[] = {23, 34, 45, 56, 67, 78};
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the index 0 to " + (arr.length - 1) + " :");

        int i = sc.nextInt();

        if (i >= 0 && i < arr.length - 1) {
            System.out.println("element of index " + arr[i]);
        } else {
            System.out.println("invalid element " + (arr.length - 1));
        }

        sc.close();

    }
}
