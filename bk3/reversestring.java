public class reversestring {
    public static void main(String[] args) {
        String s1 = "TeneT"; // Static string

        // Using StringBuilder for better performance
        String s2 = new StringBuilder(s1).reverse().toString();

        // Checking for palindrome
        if (s1.equalsIgnoreCase(s2)) { 
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
