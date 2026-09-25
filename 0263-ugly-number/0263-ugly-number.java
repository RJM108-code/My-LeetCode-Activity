/*class Solution {
    public boolean isUgly(int n) 
    {
        if(n<1)
        return false;

        if(n==1)
        return true;

        //part to reduce all the 2 factors and make the number even
        while(n%2==0)
        {
            n/=2;
        }

        //part to check the other primes
        for(int i=3; i*i<=n; i++)
        {
            while(n%i==0)
            {
                if(i>5)
                {
                    return false;
                }
                n /= i;
            }
        }
        
        if(n>2)
        {
            if(n!=3 && n!=5)
            return false;
            else
            return true;
        }

        return true;
    }
} */


class Solution {
    public boolean isUgly(int n) 
    {
        if (n <= 0) 
        {
            return false;
        }

        while (n % 2 == 0) 
        {
            n /= 2;
        }

        while (n % 3 == 0) 
        {
            n /= 3;
        }

        while (n % 5 == 0) 
        {
            n /= 5;
        }

        return n == 1;
    }
}
