class Solution {
    public int firstUniqChar(String s) {

        int arr[] =new int[26];

        Queue<Integer> a =new LinkedList<>();

        int n =s.length();
        int i=0;
        while(i<n){
            char ch =s.charAt(i);
            a.add(i);
            arr[ch-'a']++;


            while(!a.isEmpty() && arr[s.charAt(a.peek())-'a']>1){
             a.remove();
                
             
            }

            i++;
        }

       if(a.isEmpty()){
           return -1;
       }

       return a.peek();
    }
}