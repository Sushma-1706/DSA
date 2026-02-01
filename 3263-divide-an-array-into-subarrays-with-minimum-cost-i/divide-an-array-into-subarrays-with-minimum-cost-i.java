import java.util.Arrays;

class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        
        // First element is always included
        int first = nums[0];
        
        // Sort remaining elements
        Arrays.sort(nums, 1, n);
        
        // Add two smallest from remaining
        return first + nums[1] + nums[2];
    }
}
