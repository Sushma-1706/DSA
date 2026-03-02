class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        int[] num = new int[n];
        for(int i=0;i<n1;i++){
            num[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            num[n1+i]=nums2[i];
        }
        Arrays.sort(num);
        if(n%2==0){
            double median=(double)(num[n/2]+num[n/2-1])/2;
            return median;
        }else{
            return num[n/2];
        }
    }
}