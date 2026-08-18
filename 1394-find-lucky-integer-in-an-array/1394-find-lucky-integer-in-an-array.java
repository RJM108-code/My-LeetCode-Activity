class Solution {
    public int findLucky(int[] arr) 
    {
        Map<Integer, Integer> m = new HashMap<>();

        int len = arr.length, res = Integer.MIN_VALUE;

        for(int i=0; i<len; i++)
        {
            //m.merge(i,1,Integer::sum);
            int a = arr[i];
            if(m.containsKey(a))
            m.put(a,m.get(a)+1);
            else
            m.put(a,1);
        }

        for(Map.Entry<Integer, Integer> entry : m.entrySet())
        {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(key != null && Objects.equals(key, value) && key > res)
            res = key;
        }
        if(res!=Integer.MIN_VALUE)
        return res;
        else
        return -1;
        
    }
}