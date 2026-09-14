class Solution 
{
    public String reverseWords(String s) 
    {
        char ch[] = s.toCharArray();

        int start = 0;
        for(int k = 0; k<=ch.length; k++)
        {
            if(k == ch.length || ch[k]==' ')
            {
                int i = start, j = k-1;
                while(i<j)
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
                }
                start = k+1;
            }
        }
        
        return new String(ch);
    }
}