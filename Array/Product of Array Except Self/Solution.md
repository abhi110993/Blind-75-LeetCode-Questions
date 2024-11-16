# Question
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

# Intuition
Since we can not divide we will multiply.

# Approach
1. We will take left to right multiplication and right to left multiplication. 
2. We will mutiply left to right at index i-1 with right to left at index i+1. We will ignore element at index i.

# Complexity
- Time complexity:
  To store left to right multiplication: O(n)
  To store right to left multiplication: O(n)
  To Process at each element: O(n)
  Total: O(n)

- Space complexity:
  Need to store O/P, left to right and right to left. So O(n)
  ## Improvement
  If output array is not considered as an extra space then we can store right to left in output array and left to right in the input array. (Remember to store right to left first).
  Now we will update the output array from left to right as at any index we would require only the index+1 element in the output array.
  So the Space complexity becomes O(1).

# Code
```
class Solution {
    public int[] productExceptSelf(int[] a) {
        int[] rl = new int[a.length];
        int n = a.length-1;
        rl[n]=a[n];
        for(int i=n-1;i>0;i--)
            rl[i] = rl[i+1]*a[i];
        
        for(int i=1;i<=n;i++)
            a[i] = a[i-1]*a[i];
        
        if(n>0)
            rl[0] = rl[1];  
        
        for(int i=1;i<n;i++)
            rl[i]= a[i-1]*rl[i+1];
        
        if(n>0)
            rl[n] = a[n-1];
        
        return rl;
    }
}
```
