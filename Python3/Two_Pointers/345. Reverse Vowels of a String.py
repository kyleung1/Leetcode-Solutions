class Solution:
    def reverseVowels(self, s: str) -> str:
        l, r = 0, len(s) - 1
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        s_list = list(s)

        while l < r:
            if s_list[l] in vowels and s_list[r] in vowels:
                oldL = s_list[l]
                s_list[l] = s_list[r]
                s_list[r] = oldL
                l += 1
                r -= 1
            if s[l] not in vowels:
                l += 1
            if s[r] not in vowels:
                r -= 1
        
        return ''.join(s_list)