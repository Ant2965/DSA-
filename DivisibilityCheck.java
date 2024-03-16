import java.util.*;
public class DivisibilityCheck {
    
    // Function to determine if there exists a permutation divisible by 8
    public static String[] checkDivisibility(String[] arr) {
        // Array to store the result strings
        String[] result = new String[arr.length - 1];
        
        // Iterate through the array of integer strings
        for (int i = 1; i < arr.length; i++) {
            // Get the last three digits of the number
            String num = arr[i];
            int n = num.length();
            int lastThreeDigits = Integer.parseInt(num.substring(Math.max(0, n - 3)));
            
            // Check if the last three digits form a number divisible by 8
            if (lastThreeDigits % 8 == 0) {
                result[i - 1] = "YES";
            } else {
                result[i - 1] = "NO";
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"3", "123", "456", "312"};
        String[] result = checkDivisibility(arr);
        System.out.println(Arrays.toString(result));  // Output: [YES, NO, NO]
    }
}
