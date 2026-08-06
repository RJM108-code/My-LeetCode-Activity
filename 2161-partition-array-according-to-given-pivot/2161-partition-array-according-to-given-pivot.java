class Solution 
{
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int l = nums.length;

        int c1 = 0, c2 = 0, c3 = 0;
        for(int i=0; i<l; i++)
        {
            if(nums[i]==pivot)
            c2++;
            else if(nums[i]<pivot)
            c1++;
            else
            c3++;
        }       

        int sol[] = new int[l];
        int i = 0, j = c1+c2, k = c1;
        int t = 0;
        while(t<l)
        {
            if(nums[t]<pivot)
            {
                sol[i] = nums[t];
                i++;
            }
            else if(nums[t]==pivot)
            {
                sol[k] = pivot;
                k++;
            }
            else if(nums[t]>pivot)
            {
                sol[j] = nums[t];
                j++;
            }

            t++;
        }

        return sol;
    }
}