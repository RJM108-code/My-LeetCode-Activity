class Solution 
{
    //Brute Force
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],i);
        }
        for(int i=0;i<n;i++)
        {
            int remVal=target-nums[i];
            if(mp.containsKey(remVal) && mp.get(remVal)!=i)
            return new int[]{i,mp.get(remVal)};
        }
        return new int[]{};
    }
}