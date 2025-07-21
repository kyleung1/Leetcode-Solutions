class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "": return ""

        needMap, window = {}, {}
        # populate need map
        for c in t: 
            needMap[c] = 1 + needMap.get(c, 0)

        have, need = 0, len(needMap)
        res, resLen = [-1, -1], float("infinity")
        l = 0 # left window pointer
        for r in range(len(s)):
            c = s[r] # furthest right character
            window[c] = 1 + window.get(c, 0) # adds the count to window

            if c in needMap and window[c] == needMap[c]:
                have += 1 # update have var if # of c in window and needmap are equal

            while have == need: # while have equal to need
                # update our result
                if (r - l + 1) < resLen: # if current len of window substring < current reslen
                    res = [l, r]
                    resLen = (r - l + 1)
                # pop from the left of our window to try to minimize
                window[s[l]] -= 1 # remove it from window dictionary count
                if s[l] in needMap and window[s[l]] < needMap[s[l]]: # if removing a character made the count less than what it needed to be
                    have -= 1
                l += 1
        l,r = res
        return s[l:r+1] if resLen != float("infinity") else ""