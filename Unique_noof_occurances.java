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