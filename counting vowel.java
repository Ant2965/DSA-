/*You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
  */





class Solution {
    public boolean halvesAreAlike(String s) {
    int c= s.length();

   int counti=0;

    int countj=0;

    //int mid=s.length()/2;

    for(int i=0,j=s.length()/2;i<s.length()/2 && j<s.length();i++,j++){

        if(vowel(s.charAt(i))){
            counti++;
        }

         if(vowel(s.charAt(j))){
            countj++;
        }


        

           
            
    }
    if(counti!=countj){
            return false;

        }
            return true;

    }


    public static boolean vowel(char a){
        if(a=='a'|| a=='e'||a=='i'||a=='o'||a=='u'||a=='A'|| a=='E'||a=='I'||a=='O'||a=='U'){
            return true;
        }
        return false;
    }






        
}
