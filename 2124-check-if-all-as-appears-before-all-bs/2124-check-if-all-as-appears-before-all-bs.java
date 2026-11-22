class Solution 
{
    public boolean checkString(String s) 
    {
        int a = s.lastIndexOf('a');
        int b = s.indexOf('b');
        if(b==-1)
        return true;

        
        if(a<b)
        return true;
        else
        return false;
        
    }
}