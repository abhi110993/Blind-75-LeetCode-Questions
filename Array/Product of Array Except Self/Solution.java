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