class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len (s1) > len(s2): return False

        s1Count, s2Count = [0] * 26, [0] * 26
        # go through len of s1 in s1 and s2 and initialize their starting letters
        for i in range(len(s1)):
            s1Count[ord(s1[i]) - ord('a')] += 1 # this maps to one of the 26 characters
            s2Count[ord(s2[i]) - ord('a')] += 1

        matches = 0
        for i in range(26): # go through all characters
            matches += (1 if s1Count[i] == s2Count[i] else 0) # add 1 to matches if character is s1 same as s2 else 0, this matches even when both strings don't have a certain character and adds 1

        l = 0 # left pointer for sliding window
        for r in range(len(s1), len(s2)): # right pointer iterate through every position, starts at len s1 since already counted
            if matches == 26: return True

            # adding character at right of slided window
            index = ord(s2[r]) - ord('a') # maps s2[r] to ascii index, this was just added to our s2 string so increment by 1 in next line
            s2Count[index] += 1
            if s1Count[index] == s2Count[index]:
                matches += 1 # they now match — maybe they were off by 1 before
            elif s1Count[index] + 1 == s2Count[index]: # also possible that incrementing makes it too large, this means that they were equal but s2count was incremented
                matches -= 1 # they used to match, but now s2 has one extra

            # same block as above but for character removed at left of window
            index = ord(s2[l]) - ord('a')
            s2Count[index] -= 1
            if s1Count[index] == s2Count[index]:
                matches += 1
            elif s1Count[index] - 1 == s2Count[index]:
                matches -= 1
            l += 1
        return matches == 26