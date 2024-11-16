class Solution {
    public int maxProfit(int[] a) {
        int max = a[a.length-1], maxD = 0;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>max){
                max = a[i];
            }else{
                maxD = Math.max(maxD,(max-a[i]));
            }
        }
        return maxD;
    }
}
