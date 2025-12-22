class Solution {
    public int removeDuplicates(int[] nums){
         int unique_element = 1;

        for (int i=1;i<nums.length;i++){
            
                 if(nums[i]!=nums[i-1]){
                    nums[unique_element] = nums[i];
                     unique_element++;
                     }
            }
        
        return unique_element;
    }
}
    
