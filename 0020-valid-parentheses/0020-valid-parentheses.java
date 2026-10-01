import java.util.*;
class Solution {
    public boolean isValid(String s)
    {
        if(s.isEmpty()==true)
        return false;
        Map<Character,Character> pairs=new HashMap<>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');
        Stack<Character> st1=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='{'||ch=='['||ch=='(')
            st1.push(ch);
            else
            {
                    if(st1.isEmpty()==true)
                    return false;
                    else if(st1.pop()!=pairs.get(ch))
                    return false;
            }
        }
        if(st1.isEmpty()==true)
        return true;
        else
        return false;

    }
}