class Solution 
{
    public int trap(int[] height) 
    {
        int maxL = 0, maxR = 0, l = 0, r = height.length-1;
        int water = 0;

        while(l<r)
        {
            maxL = Math.max(maxL, height[l]);
            maxR = Math.max(maxR, height[r]);

            if(maxL<maxR)
            {
                water += maxL - height[l];
                l++;
            }
            else
            {
                water +=maxR - height[r];
                r--;
            }
        }

        return water;
    }
}