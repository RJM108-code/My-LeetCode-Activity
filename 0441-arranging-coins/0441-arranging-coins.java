class Solution 
{
    public int arrangeCoins(int n) 
    {
        if(n==1 || n==0)
        return n;

        int count = 0;
        boolean i = true;
        int j = 0;
        while(i==true)
        {
            n -= j;
            j++;
            if(j<=n)
            {
                count++;
                i = true;
            }
            else
            {
                i = false;
            }
        }

        return count;
    }
}