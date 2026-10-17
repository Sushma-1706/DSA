class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        m=len(word1)
        n=len(word2)
        word=[]
        i=0
        while i<m or i<n:
            if i<m:
                word.append(word1[i])
            if i<n:
                word.append(word2[i])
            i+=1
        return "".join(word)