class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
       int n = startTime.length;
        int[][] jobs = new int[n][3]; // Combine the arrays into a 2D array

        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }

        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1])); // Sort by end time

        int[] dp = new int[n + 1]; // Dynamic programming array

        for (int i = 1; i <= n; i++) {
            int currentProfit = jobs[i - 1][2];
            int prevIndex = binarySearch(jobs, i);

            dp[i] = Math.max(dp[i - 1], currentProfit + dp[prevIndex]);
        }

        return dp[n];
    }

    private int binarySearch(int[][] jobs, int currentIndex) {
        int lo = 0, hi = currentIndex - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (jobs[mid][1] <= jobs[currentIndex - 1][0]) {
                if (jobs[mid + 1][1] <= jobs[currentIndex - 1][0]) {
                    lo = mid + 1;
                } else {
                    return mid + 1;
                }
            } else {
                hi = mid - 1;
            }
        }

        return 0;
    } 
    
}