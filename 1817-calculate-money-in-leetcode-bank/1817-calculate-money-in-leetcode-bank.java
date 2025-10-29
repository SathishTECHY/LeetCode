class Solution {
    public int totalMoney(int n) {
        int fullWeeks = n / 7;
        int remainingDays = n % 7;

        int total = 0;

        // full weeks calculation
        for (int week = 0; week < fullWeeks; week++) {
            total += 28 + (7 * week);
        }

        // remaining days calculation
        for (int day = 1; day <= remainingDays; day++) {
            total += fullWeeks + day;
        }

        return total;
    }
}