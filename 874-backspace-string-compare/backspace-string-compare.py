class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        result=[]
        result1=[]
        for ch in s:
            if ch=='#':
               if result:
                result.pop()
            else: 
                result.append(ch)
        for ch in t:
            if ch=='#':
               if result1:
                result1.pop()
            else: 
                result1.append(ch)
        return result==result1