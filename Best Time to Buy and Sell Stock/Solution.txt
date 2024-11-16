# Question
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

# Intuition
First we have to buy and then we have to sell. We need to sell at the maximum value and buy at the minimum value. Also, buy before selling.

# Approach
If we select the selling point first and then find the minimum value of buying point before selling point we will get our answer. 

We will consider the maximum value at the last of the array ad then slowly we will traverse back and keep updating the maximum value and maximum profit.

# Complexity
- Time complexity:
    Here we will only have to look at each value only once. Hence the time complexity is O(n).

- Space complexity:
    Only few number of variables are used here so Space Complexity is O(1).

# Code
class Solution {
    public int maxProfit(int[] a) {
        int max = a[a.length-1];
        int maxD = 0;
        for(int i=a.length-1;i>=0;i--){
            max = Math.max(a[i], max);
            maxD = Math.max(maxD, max-a[i]);
        }
        return maxD;
    }
}
