class Solution 
{
    public int sumOfSquares(int[] nums) 
    {
        int sum = 0;
        int l = nums.length;

        for(int i=1; i<=l; i++)
        {
            if(l%i==0)
            sum += Math.pow(nums[i-1],2);
        }

        return sum;
    }
}