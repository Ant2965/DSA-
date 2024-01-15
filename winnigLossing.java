/*You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

Return a list answer of size 2 where:

answer[0] is a list of all players that have not lost any matches.
answer[1] is a list of all players that have lost exactly one match.
The values in the two lists should be returned in increasing order.

Note:

You should only consider the players that have played at least one match.
The testcases will be generated such that no two matches will have the same outcome. */



class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer,Integer> lost=new HashMap<>();

        for(int i=0;i<matches.length;i++){
            int loser =matches[i][1];

           if(!lost.containsKey(loser)){
               lost.put(loser,1);
           }

           else{
               lost.put(loser,lost.get(loser)+1);
           }

        }

      List<List<Integer>> ans=new ArrayList<>();

        List<Integer> notlost = new ArrayList<>();
        List<Integer> lostonce = new ArrayList<>();


        for(int i =0;i<matches.length;i++){
            int loser=matches[i][1];
            int winner=matches[i][0];


            if(!lost.containsKey(winner)){
                notlost.add(winner);
                lost.put(winner,2);
            }

            if(lost.get(loser)==1){
                lostonce.add(loser);
            }
        }

        Collections.sort(notlost);
        Collections.sort(lostonce);

    ans.add(new ArrayList(notlost));
    ans.add(new ArrayList(lostonce));

    return ans;
    }
}