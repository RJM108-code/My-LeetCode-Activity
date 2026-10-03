class Solution 
{
    public String addStrings(String num11, String num22) 
    {
        int l1 = num11.length();
        int l2 = num22.length();

        String num1 = new StringBuilder(num11).reverse().toString();
        String num2 = new StringBuilder(num22).reverse().toString();
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int sum = 0;

        int a = Math.min(l1,l2);
        for(int i=0; i<a; i++)
        {
            int c1 = num1.charAt(i)-'0';
            int c2 = num2.charAt(i)-'0';
            sum = c1 + c2 + carry;
            if(sum<=9)
            {
                sb.append(sum);
                carry = 0;
            }
            else
            {
                sb.append(sum%10);
                carry = sum/10;
            }
        }
        
        sum = 0;

        if(l1>l2)
        {
            for(int i=a; i<l1; i++)
            {
                int dig = num1.charAt(i) - '0';
                sum = dig + carry;
                sb.append(sum%10);
                carry = sum/10;
            }
        }
        else if(l2>l1)
        {
            for(int i=a; i<l2; i++)
            {
                int dig = num2.charAt(i) - '0';
                sum = dig + carry;
                sb.append(sum%10);
                carry = sum/10;
            }
        }

        if(carry!=0)
        sb.append(carry);

        return sb.reverse().toString();
    }
}