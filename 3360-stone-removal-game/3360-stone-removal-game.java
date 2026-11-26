class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceTurn = true;
        int t = 10;

        while (n >= t && t > 0) {
            n -= t;
            if (n <= 0) {
                return aliceTurn;
            }
            aliceTurn = !aliceTurn;
            t--;
        }

        return !aliceTurn;
    }
}