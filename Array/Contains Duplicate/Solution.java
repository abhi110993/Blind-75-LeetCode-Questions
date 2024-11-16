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