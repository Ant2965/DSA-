public class RequestProcessing {
     public static int getMinTime(int n, int[] cache) {
        int[] serviceCounts = new int[n];
        for (int c : cache) {
            serviceCounts[c - 1]++;
        }

        int maxCachedRequests = 0;
        for (int count : serviceCounts) {
            maxCachedRequests = Math.max(maxCachedRequests, count);
        }

        // Calculate the total number of requests
        int totalRequests = cache.length;

        int minTime = Integer.MAX_VALUE;
        for (int count : serviceCounts) {
            int timeFromCache = count;
            int timeNotFromCache = totalRequests - count;
            int totalTime = Math.max(timeFromCache, (timeNotFromCache + 1) / 2);
            minTime = Math.min(minTime, totalTime);
        }

     
        return minTime + 1;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] cache = {1, 1, 1, 3, 1};
        System.out.println(getMinTime(n, cache)); // Output: 3
    }
}
