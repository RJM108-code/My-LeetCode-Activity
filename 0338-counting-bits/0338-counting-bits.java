class Solution 
{
    public int[] countBits(int n) 
    {
        int dp[] = new int[n+1];
        if(n==0)
        {
            dp[0] = 0;
            return dp;
        }
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++)
        {
            if(i%2!=0)
            dp[i] = dp[i/2] + 1;
            else
            dp[i] = dp[i/2];
        }
        
        return dp;
    }
}