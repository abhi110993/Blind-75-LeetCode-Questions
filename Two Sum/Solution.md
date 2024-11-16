# Question

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

# Intuition
2 elements are to be added therefore we can use one element and other we can check by subtracting the element.

# Approach
The best way to check the element on O(1) is using HashMap or HashSet. 

There is a case where target-element=element, for eg: 10-5=5. If we use HashSet then we will be getting the same element which is 5, and if we find the element in the HashSet we will get 5 again.

Hence, We need to use HashMap of HashSet where we will be keeping information of element in HashMap and it's indices in it's HashSet.
Rest go through my code it is self explanatory.

# Complexity
- Time complexity:
  For n times Search in HashMap takes O(1), even if there is a match there can be maximum of 2 iteration in the HashSet. Hence, Total time complexity is O(n).

- Space complexity:
  For each element there will a O(1) addition to either the HashMap or the HashSet inside HashMap.
  Therefore, the total space complexity is O(n).

# Code
```
class Solution {
    public int[] twoSum(int[] a, int target) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!hm.containsKey(a[i]))
                hm.put(a[i], new ArrayList<>());
            hm.get(a[i]).add(i);
            int rem = target-a[i];
            if(hm.containsKey(rem)){
                for(int j: hm.get(rem)){
                    if(i!=j)
                        return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
```
