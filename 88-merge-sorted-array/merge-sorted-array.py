class Solution:
    def merge(self, num1: list[int], m: int, num2: list[int], n: int) -> None:
        i=m-1
        j=n-1
        k=m+n-1
        while i>=0 and j>=0:
            if num1[i]>num2[j]:
                num1[k]=num1[i]
                i-=1
            else:
                num1[k]=num2[j]
                j-=1
            k-=1
        while j>=0:
            num1[k]=num2[j]
            j-=1
            k-=1
