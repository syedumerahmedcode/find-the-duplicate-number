import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given an array of integers nums containing n + 1 integers where each integer
         * is in the range [1, n] inclusive.
         * 
         * There is only one repeated number in nums, return this repeated number.
         * 
         * You must solve the problem without modifying the array nums and using only
         * constant extra space.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,3,4,2,2]
         * Output: 2
         * 
         * Example 2:
         * 
         * Input: nums = [3,1,3,4,2]
         * Output: 3
         * 
         * Example 3:
         * 
         * Input: nums = [3,3,3,3,3]
         * Output: 3
         */
        System.out.println("Hello, World!");
        int[] nums = { 3, 1, 3, 4, 2 };
        Solution solution = new Solution();
        int result = solution.findDuplicate(nums);
        System.out.println("The given input is: " + Arrays.toString(nums) + " and the result is: " + result);
    }
}
