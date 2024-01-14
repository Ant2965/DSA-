class Solution {
    public boolean closeStrings(String word1, String word2) {
        int m = word1.length();
        int n=word2.length();


        if(m!=n){
            return false;
        }

        int a[]=new int[26];
        int b[]=new int[26];

        for(int i=0;i<m;i++){
            char ch = word1.charAt(i);
            char cha=word2.charAt(i);

            int index =ch-'a';
            int index1 = cha-'a';

            a[index]++;
             b[index1]++;

        }

        for(int i=0;i<26;i++){
            if(a[i]!=0&&b[i]!=0)continue;
            if(a[i]==0&&b[i]==0)continue;

            return false;

        }

        Arrays.sort(a);
        Arrays.sort(b);

          for(int i=0;i<a.length;i++){
             if(a[i]!=b[i])
              return false;
            }
    

        return true;



    }
}