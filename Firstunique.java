/*

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters. */





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