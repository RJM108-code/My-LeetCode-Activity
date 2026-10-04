/*class Solution 
{
    public int arrangeCoins(int n) 
    {
        if(n==1 || n==0)
        return n;

        int count = 0;
        boolean i = true;
        int j = 0;
        while(i==true)
        {
            n -= j;
            j++;
            if(j<=n)
            {
                count++;
                i = true;
            }
            else
            {
                i = false;
            }
        }

        return count;
    }
}*/

class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int row = 1;

        while (n >= row) { 
            n -= row;      
            count++;       
            row++;         
        }

        return count;
    }
}

