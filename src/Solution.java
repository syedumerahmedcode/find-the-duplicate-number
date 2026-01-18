public class Solution {

    public int findDuplicate(int[] nums) {
        /**
         * We will use fast and slow pointer apporach in two steps:
         * 1 - first, to detect the cycle
         * 2 - second, to find the duplicate element
         * Given the particular
         */
        /**
         * initializing fast and slow pointers
         */
        int slow = nums[0];
        int fast = nums[nums[0]];

        /**
         * Finding the intersection point of the two runners. In other words, detecting
         * the cycle
         */
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        /**
         * Find the "entrance" to the cycle. In other words, find the duplicate element.
         * For that to happen, slow must be reset to zero and fast now jumps only one
         * elment.
         */
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }

}
