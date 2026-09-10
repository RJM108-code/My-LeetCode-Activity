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

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums2)
        {
            if(m1.containsKey(i) && m1.get(i)>0)
            {
                arr.add(i);
                int a = m1.get(i);
                m1.put(i, --a);
            }
        }

        int[] sol = arr.stream().mapToInt(Integer::intValue).toArray();

        return sol;
    }
}