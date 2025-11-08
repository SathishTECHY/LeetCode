class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // Step 1: Store all numbers in a HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Loop through each number
        for (int num : set) {
            // Only start counting if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Count how many consecutive numbers follow
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Update max length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

}