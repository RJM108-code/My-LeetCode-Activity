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

/*class Solution {
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
}*/

class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        
        while (left <= right) {
            long pivot = left + (right - left) / 2;
            long coinsUsed = pivot * (pivot + 1) / 2;
            
            if (coinsUsed == n) {
                return (int)pivot; // Perfect fit
            }
            
            if (n < coinsUsed) {
                right = pivot - 1; // Too many coins used, look lower
            } else {
                left = pivot + 1;  // Look higher
            }
        }
        
        return (int)right; // 'right' will naturally settle on the last complete row
    }
}


