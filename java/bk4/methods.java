public class methods
{
    public static int disp() 
    {
        int a=10;
        int x=a+20;
        System.out.println("inside the disp");
        return x;
    }
    public static void main(String[] args) 
    {
        int f=disp();
        System.out.println("inside the main method");
        System.out.println(f);
    }
}