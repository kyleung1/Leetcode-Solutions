class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        array = s.split()
        newArray = []
        
        for i in range(len(array)):
            newArray.append(array.pop())
        
        newstring = " ".join(newArray)
            
        return newstring
