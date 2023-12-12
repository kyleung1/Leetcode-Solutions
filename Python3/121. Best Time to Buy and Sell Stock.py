class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # min_value = 10000
        # max_profit = 0

        # for price in prices:
        #     print(price)
        #     if (min_value > price):
        #         min_value = price
        #     elif (price - min_value > max_profit):
        #         max_profit = price - min_value

        # return max_profit

        l, r = 0, 1
        maxP = 0

        while r < len(prices):
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                maxP = max(maxP, profit)
            else:
                l = r
            r += 1
        
        return maxP