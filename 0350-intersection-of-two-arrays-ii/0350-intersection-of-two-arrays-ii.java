import java.util.*;
class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Map<Integer,Integer> m1 = new HashMap<>();

        for(int i : nums1)
        {
            if(!m1.containsKey(i))
            m1.put(i,1);
            else
            {
                int a = m1.get(i);
                m1.put(i,++a);
            }
        }

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for(int i : nums2)
        {
            if(m1.containsKey(i) && m1.get(i)>0)
            {
                result[index++] = i;
                m1.put(i, m1.get(i) - 1);
            }
        }

        return Arrays.copyOf(result, index);
    }
}