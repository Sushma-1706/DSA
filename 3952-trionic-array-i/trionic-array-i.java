class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;
        
        // Phase 1: strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        
        // p must exist (cannot be at start or end)
        if (i == 0 || i == n - 1) return false;
        
        // Phase 2: strictly decreasing
        int j = i;
        while (j + 1 < n && nums[j] > nums[j + 1]) {
            j++;
        }
        
        // q must exist and not touch end
        if (j == i || j == n - 1) return false;
        
        // Phase 3: strictly increasing
        while (j + 1 < n && nums[j] < nums[j + 1]) {
            j++;
        }
        
        // must consume entire array
        return j == n - 1;
    }
}
