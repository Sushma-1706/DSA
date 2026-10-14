class Solution:
    def isPalindrome(self, s: str) -> bool:
        strs = "".join(ch for ch in s if ch.isalnum())
        strs=strs.lower()
        return strs==strs[::-1]


