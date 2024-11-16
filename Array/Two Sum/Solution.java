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
