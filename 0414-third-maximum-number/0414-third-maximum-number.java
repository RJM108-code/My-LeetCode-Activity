class Solution {
    public int thirdMax(int[] nums) 
    {
        int l = nums.length;

        if (l == 1) return nums[0];
        if (l == 2) return Math.max(nums[0], nums[1]);

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        int third_max = Integer.MIN_VALUE;
        
        int distinctCount = 0; 
        boolean containsMinVal = false;

        for (int i : nums) {
            if (i == Integer.MIN_VALUE) {
                containsMinVal = true;
                continue;
            }
            if (i == max || i == sec_max || i == third_max) {
                continue;
            }

            if (i > max) {
                third_max = sec_max;
                sec_max = max;
                max = i;
                distinctCount++;
            } 
            else if (i > sec_max) {
                third_max = sec_max;
                sec_max = i;
                distinctCount++;
            } 
            else if (i > third_max) {
                third_max = i;
                distinctCount++;
            }
        }

        if (containsMinVal) {
            if (distinctCount == 0) return max;
            if (distinctCount == 1) { sec_max = Integer.MIN_VALUE; distinctCount++; }
            else if (distinctCount == 2) { third_max = Integer.MIN_VALUE; distinctCount++; }
        }

        return (distinctCount >= 3) ? third_max : max;
    }
}
