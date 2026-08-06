class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        /*for(int i=0; i<n; i++)
        {
            if(nums[i]<0)
            nums[i] *= -1;
        }

        Arrays.sort(nums);
        for(int i=0; i<n; i++)
        {
            nums[i] = (int) Math.pow(nums[i],2);
        }

        return nums;*/
        int i = 0, j = n-1;
        int ans[] = new int[n];
        int k = n-1;
        while(i<=j)
        {
            int a = nums[i]*nums[i];
            int b = nums[j]*nums[j];
            if(a>=b)
            {
                ans[k] = a;
                i++;
            }
            else
            {
                ans[k] = b;
                j--;
            }
            k--;
        }

        return ans;
    }
}