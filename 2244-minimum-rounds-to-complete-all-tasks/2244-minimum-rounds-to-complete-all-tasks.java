class Solution 
{
    public int minimumRounds(int[] tasks) 
    {
        Map<Integer, Integer> m = new HashMap<>();
        for(int task : tasks)
        {
            m.merge(task,1, Integer::sum);
        }


        int rounds = 0;
        for(int i : m.values())
        {
            if(i==1)
            return -1;

            if(i%3==0)
            rounds += (int) i/3;
            else
            rounds += (int) i/3 + 1;
        }

        return rounds;
    }
}