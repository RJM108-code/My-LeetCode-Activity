class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int l1 = s.length();
        int l2 = t.length();

        if(l1==0)
        return true;

        int a = 0, b = 0;
        while(a<l1 && b<l2)
        {
            if(s.charAt(a)==(t.charAt(b)))
            {
                a++;
                b++;
            }
            else
            {
                b++;
            }

            if(a==l1)
            return true;
        }
        
        return false;
    }
}