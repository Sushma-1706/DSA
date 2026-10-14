class Solution:
    def sortedSquares(self, nums: list[int]) -> list[int]:
       num=[0]*len(nums)
       left=0
       right=len(nums)-1
       while left<=right:
         if abs(nums[left])>abs(nums[right]):
            num[right-left]=nums[left]**2
            left+=1
         else:
            num[right-left]=nums[right]**2
            right-=1
       return num

        