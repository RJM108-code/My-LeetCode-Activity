class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> m = new HashMap<>();

        for (char a : s.toCharArray()) {
            m.merge(a, 1, Integer::sum);
        }

        int res = 0;
        boolean hasOdd = false;

        for (int count : m.values()) 
        {
            res += (count / 2) * 2; 
            
            if (count % 2 != 0) {
                hasOdd = true;
            }
        }

        if (hasOdd) {
            res += 1;
        }

        return res;
    }
}
