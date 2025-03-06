import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        
            int arr[] = new int[8];

            Scanner sc = new Scanner(System.in);

            for(int i = 0; i < 8; i++){

                arr[i] = sc.nextInt();
            }

            
            for (int i = 0; i < arr.length; i++){

                System.out.println("arr is : "+arr[i]);

            }

            sc.close();

    }
}