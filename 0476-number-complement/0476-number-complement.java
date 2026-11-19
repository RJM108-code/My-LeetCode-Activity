class Solution {
    public int findComplement(int n) 
    {
        int t = 0, sum = 0;
        while(n>0)
        {
            int i =n%2;
            if(i==0)
            {
                sum += Math.pow(2,t++);
            }
            else if(i==1)
            {
                t++;
            }

            n /= 2;
        }

        return sum;
        
    }
}