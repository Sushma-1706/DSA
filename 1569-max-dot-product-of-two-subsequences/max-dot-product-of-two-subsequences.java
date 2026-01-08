class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // Use a very small number to represent -infinity
        int NEG_INF = Integer.MIN_VALUE / 2;

        int[][] dp = new int[n + 1][m + 1];

        // Initialize DP with NEG_INF
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = NEG_INF;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                int product = nums1[i - 1] * nums2[j - 1];

                // Take both elements (start new or extend subsequence)
                int take = Math.max(
                    product,
                    dp[i - 1][j - 1] + product
                );

                // Skip one element from either array
                dp[i][j] = Math.max(
                    take,
                    Math.max(dp[i - 1][j], dp[i][j - 1])
                );
            }
        }

        return dp[n][m];
    }
}
