class Solution {
    public int deleteAndEarn(int[] nums) 
    {
        int maxVal = 0;
        for(int i : nums)
        {
            maxVal = Math.max(maxVal,i);
        }

        int hr[] = new int[maxVal+1];
        for(int i : nums)
        {
            hr[i] += i;
        }

        int dp[] = new int[maxVal+1];
        dp[0] = hr[0];
        dp[1] = Math.max(hr[0], hr[1]);

        for(int i=2; i<maxVal+1; i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2]+hr[i]); 
        }

        int n = dp.length;
        return dp[n-1];
        
    }
}