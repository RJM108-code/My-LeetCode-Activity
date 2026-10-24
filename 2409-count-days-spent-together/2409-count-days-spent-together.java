class Solution 
{    
    private final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) 
    {
        int aliceStart = countDays(arriveAlice);
        int aliceEnd = countDays(leaveAlice);
        int bobStart = countDays(arriveBob);
        int bobEnd = countDays(leaveBob);

        // Find the overlapping range
        int overlapStart = Math.max(aliceStart, bobStart);
        int overlapEnd = Math.min(aliceEnd, bobEnd);

        // Calculate the number of overlapping days
        if (overlapEnd >= overlapStart) 
        {
            return overlapEnd - overlapStart + 1;
        }

        return 0;
    }

    // Helper method to convert "MM-DD" into the day number of the year (1 to 365)
    private int countDays(String date) 
    {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int totalDays = 0;
        // Add days from preceding months
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Add days of the current month
        return totalDays + day;
    }
}