class Solution {
    public int countStudents(int[] students, int[] sandwiches) 
    {
        Stack<Integer> s = new Stack<>();

        Queue<Integer> q = new ArrayDeque<>();

        for(int i=0; i<students.length; i++)
        {
            q.offer(students[i]);
        }
        
        int i = 0;
        int rotations = 0;
        while(!q.isEmpty() && i<sandwiches.length)
        {
            if(sandwiches[i]==q.peek())
            {
                i++;
                int a = q.poll();
                rotations = 0;
            }
            else
            {
                q.offer(q.poll());
                rotations++;

                if(rotations==q.size())
                break;
            }
        }

        return q.size();
    }
}