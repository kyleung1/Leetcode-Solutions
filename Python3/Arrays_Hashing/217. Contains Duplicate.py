class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        dupe = False

        for i in nums:
            if i in hashset:
                dupe = True
            hashset.add(i)
                    
        return dupe