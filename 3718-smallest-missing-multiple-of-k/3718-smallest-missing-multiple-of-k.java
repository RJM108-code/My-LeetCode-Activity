import java.util.Collections;
class Solution 
{
    public int missingMultiple(int[] nums, int k) 
    {
        Set<Integer> s = new HashSet<>();
        for(int i : nums)
        {
            if(i%k==0)
            s.add(i);
        }

        int multiple = k;
        while(s.contains(multiple))
        {
            multiple += k;
        }

        return multiple;
    }
}