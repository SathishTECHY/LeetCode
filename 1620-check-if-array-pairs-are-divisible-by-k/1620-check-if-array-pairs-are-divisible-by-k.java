class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] rem = new int[k];

        // Count remainders
        for (int n : arr) {
            int r = n % k;
            if (r < 0) r += k;  // handle negative numbers
            rem[r]++;
        }

        // Check remainder 0 group
        if (rem[0] % 2 != 0) return false;

        // Check pairs of remainders
        for (int r = 1; r < k; r++) {
            if (r == k - r) {       // middle remainder (only when k even)
                if (rem[r] % 2 != 0) return false;
            } else {
                if (rem[r] != rem[k - r]) return false;
            }
        }

        return true;
    }
}
