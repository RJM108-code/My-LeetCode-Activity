class Solution 
{
    public int thirdMax(int[] nums) 
    {
        Long max = null;
        Long sec_max = null;
        Long third_max = null;

        for (int i : nums) {
            long current = i; 

            if ((max != null && current == max) || 
                (sec_max != null && current == sec_max) || 
                (third_max != null && current == third_max)) {
                continue;
            }

            if (max == null || current > max) {
                third_max = sec_max;
                sec_max = max;
                max = current;
            } else if (sec_max == null || current > sec_max) {
                third_max = sec_max;
                sec_max = current;
            } else if (third_max == null || current > third_max) {
                third_max = current;
            }
        }

        return (third_max == null) ? max.intValue() : third_max.intValue();
    }
}
