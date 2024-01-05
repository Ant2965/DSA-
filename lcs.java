class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length+1];
                for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans=check(0,-1,nums,nums.length,dp);
        return ans;
    }
    public static int check(int indx,int pre_indx,int nums[],int n,int dp[][]){
            if(indx==n){
                return 0;
            }
            if(dp[indx][pre_indx+1]!=-1){
                return dp[indx][pre_indx+1];
            }
            // not picking
            int len=0+check(indx+1,pre_indx,nums,n,dp);
            //picking
            if(pre_indx== -1 || nums[indx]>nums[pre_indx]){
                len=Math.max(len,1+check(indx+1,indx,nums,n,dp));
            }
            dp[indx][pre_indx+1]=len;
            return len;
    }
}