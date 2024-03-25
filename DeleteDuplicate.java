class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int fre[]=new int[nums.length+1];
        List<Integer>res=new ArrayList<>();
      


        for(int i=0;i<nums.length;i++){
            int count = nums[i];
            fre[count]++;
        }

        
     for( int i =1 ; i <= nums.length ; i++){
        if(fre[i] == 2){
            res.add(i);
        }
    }
        
    return res;

        
    }
}