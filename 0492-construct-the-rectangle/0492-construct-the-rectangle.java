class Solution {
    public int[] constructRectangle(int area) 
    {
        int ans[] = new int[2];
        int min_diff = Integer.MAX_VALUE;
        for(int i=1; i*i<=area; i++)
        {
            if(area%i==0)
            {
                int W = i;
                int L = area/i;
                if(L>=W)
                {
                    int curr_diff = L-W;
                    if(curr_diff<min_diff)
                    {
                        min_diff = curr_diff;
                        ans[0] = L;
                        ans[1] = W;
                    }
                }
            }
        }
        return ans;
    }
}