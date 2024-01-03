class Solution {
    public int numberOfBeams(String[] bank) {

        int ans=0;
        int prev=0;

        for(int i=0;i<bank.length;i++){
            int count=0;

            String a = bank[i];
            for(int j=0;j<a.length();j++){
            if(a.charAt(j) == '1'){
                count++;
                }
            }


            if(count!=0){
                ans=ans+(count*prev);
                prev=count;

                /*hello question */

            }


                  
        }
        return ans;


    }


}