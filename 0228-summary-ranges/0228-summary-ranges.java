class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> l = new ArrayList<>();
        if(nums==null || nums.length==0) 
        {
            return l;
        }
        int n = nums.length;
        int i = 0;
        while(i<n)
        {
            int start = nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1)
            {
                i++;
            }

            if (start == nums[i]) 
            {
                l.add(String.valueOf(start));
            } 
            else 
            {
                l.add(start + "->" + nums[i]);
            }

            i++;
        }

        return l;
    }
}