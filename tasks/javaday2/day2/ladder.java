import java.util.Scanner;
public class ladder{

    public static void main(String[] args) {
        
        Scanner r = new Scanner (System.in);

        System.out.print("Enter your mark : ");

        int mark = r.nextInt();

        if (mark==100){

            System.out.println("Centum");

        }

        else if (mark>=80){

            System.out.println("Above 80");

        }else if (mark>=50){

            System.out.println("Above 50");

        }
        else if (mark>=35){

            System.out.println("Above 35");

        }
        else {

            System.out.println("Pass");

        }


        
    }
}
