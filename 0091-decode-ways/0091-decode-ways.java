class Solution 
{
    public int numDecodings(String s) 
    {
        int n = s.length();
        int dp[] = new int[n+1];
        dp[0] = 1;
        if(s.charAt(0)=='0')
        dp[1] = 0;
        else
        dp[1] = 1;

        for(int i=2; i<=n; i++)
        {
            int singleDigit = s.charAt(i - 1) - '0';
            if (singleDigit >= 1) 
            {
                dp[i] += dp[i - 1];
            }

            int twoDigits = (s.charAt(i - 2) - '0') * 10 + singleDigit;
            if (twoDigits >= 10 && twoDigits <= 26) 
            {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[n];
    }
}