/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
  */









// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {

//         HashMap<Integer,Integer> count = new HashMap<>();

//         for(int i=0;i<arr.length;i++){
//             if(!count.containsKey(arr[i])){
//                 count.put(arr[i],1);
//             }
//             count.put(arr[i],count.get(arr[i])+1);
//         } 

//         Set<Integer> oc =new HashSet<>(count.values());

//         return(oc.size()==count.size());

        
//     }
        
    
// }



// Below one is optimized

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each value in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if the counts are unique using a HashSet
        Set<Integer> occurrencesSet = new HashSet<>(countMap.values());

        // If the sizes are the same, counts are unique; otherwise, they are not
        return occurrencesSet.size() == countMap.size();
    }

    
}