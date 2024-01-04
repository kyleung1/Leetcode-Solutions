class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxCandies = max(candies)
        answer = []
        for i in candies:
            newAmt = i + extraCandies
            if newAmt >= maxCandies:
                answer.append(True)
            else:
                answer.append(False)

        return answer