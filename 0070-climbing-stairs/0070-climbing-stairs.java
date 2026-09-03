class Solution 
{
    public int climbStairs(int n) 
    {
        ArrayList<Integer> arr = new ArrayList<>(n+1);
        for(int i=0; i<=n; i++)
        {
            arr.add(-1);
        }

        return Solution.helper(n, arr);
        
    }

    public static int helper(int n, ArrayList<Integer> arr)
    {
        if(arr.get(n)!=-1)
        return arr.get(n);

        if(n==1||n==2)
        return n;

        int result = helper(n-1, arr) + helper(n-2, arr);
        arr.set(n,result);
        return result;
    }
}