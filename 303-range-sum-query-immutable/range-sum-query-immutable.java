class NumArray {
   private int[] nums;
    public NumArray(int[] nums) {
       this.nums = nums;
    }    
    public int sumRange(int i, int j) {
        int sum = 0;
        for(int s = i; s <= j; s++){
            sum += nums[s];
        }
        return sum;
    }
}
