class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left = 0, right = row.length - 1;

            while (left <= right) {
                // If left and right are same index (middle element in odd length),
                // just invert that single element
                if (left == right) {
                    row[left] ^= 1;  // invert
                } else {
                    // Swap and invert both elements
                    int temp = row[left] ^ 1;
                    row[left] = row[right] ^ 1;
                    row[right] = temp;
                }

                left++;
                right--;
            }
        }
        return image;
    }
}
