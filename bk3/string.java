public class string {
    public static void main(String[] args) {
        String s1 = "TeneT"; 
        
        String s2 = new StringBuilder(s1).reverse().toString();

        
        if (s1.equalsIgnoreCase(s2)) { 
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
