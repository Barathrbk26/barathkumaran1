public class MaxMinOfArray {
     
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        
        int max = findMax(array);
        int min = findMin(array);
        
        
        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The minimum element in the array is: " + min);
    }

    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
