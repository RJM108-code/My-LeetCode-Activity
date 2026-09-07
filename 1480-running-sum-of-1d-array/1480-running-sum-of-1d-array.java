class Solution {
    public int[] runningSum(int[] nums) 
    {
        int l = nums.length;
        if(l==0)
        return new int[0];
        int sol[] = new int[l];
        sol[0] = nums[0];
        for(int i=1;i<l; i++)
        {
            sol[i] = sol[i-1]+nums[i];
        }


        return sol;
        
    }
}