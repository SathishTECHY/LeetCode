class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Find which row may contain the target
        int row = 0;
        while (row < m && matrix[row][n - 1] < target) {
            row++;
        }

        // If no valid row
        if (row == m) return false;

        // Step 2: Binary search inside the row
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (matrix[row][mid] == target) return true;
            else if (matrix[row][mid] < target) left++;
            else right--;
        }

        return false;
    }
}
