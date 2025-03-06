public class ReverseArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};
        
        // Reverse the array
        reverseArray(array);
        
        // Print the reversed array
        System.out.println("The reversed array is:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Function to reverse the elements of a 1D array in-place
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the start and end pointers
            start++;
            end--;
        }
    }
}
