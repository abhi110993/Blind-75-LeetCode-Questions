# Question
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

# Intuition
Find the visited element.

# Approach
The best way to check the element on O(1) is using HashMap or HashSet. 

# Complexity
- Time complexity:
  O(n)

- Space complexity:
  HashSet will take O(1) for each element. Hence O(n).

# Code
```
class Solution {
    public boolean containsDuplicate(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : a) {
            if (hs.contains(i))
                return true;
            hs.add(i);
        }
        return false;
    }
}
```
