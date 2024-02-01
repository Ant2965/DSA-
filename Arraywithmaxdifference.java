class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int arr[][]=new int[n/3][3];
        for(int i=0;i<n;i+=3){
            //i,i+1,

            if(nums[i+2]-nums[i]>k){
                return new int[][] {};
            }

            arr[i/3][0] = nums[i];
            arr[i/3][1] = nums[i+1];
            arr[i/3][2] = nums[i+2];
        }

    return arr;
        
    }
}