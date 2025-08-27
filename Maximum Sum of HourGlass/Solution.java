// Maximum Sum of an HourGlass
// LeetCode 2428 (Medium)

class Solution {
    public int maxSum(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2]
                + grid[i+1][j+1]
                + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
