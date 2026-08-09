class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int l = nums.length;
        int ans[] = new int[l];
        
        int i = 0, j = 1;
        for(int k=0; k<l; k++)
        {
            if(nums[k]>=0)
            {
                ans[i] = nums[k];
                i += 2;
            }
            else
            {
                ans[j] = nums[k];
                j += 2;
            }
        }

        return ans;
    }
}