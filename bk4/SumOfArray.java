public class SumOfArray {
    public static void main(String[] args) {
        
        int[] array = {6, 2, 3, 4, 5};
        
        
        int sum = sumOfArray(array);
        
        
        System.out.println("The sum of the array elements is : " + sum);
    }

    
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
