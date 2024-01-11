class Solution {
    public int maxAncestorDiff(TreeNode root) {
       if(root==null){
           return 0;
       } 
       return maxDiff(root,root.val,root.val);
    }
    public static int maxDiff(TreeNode root,int min,int max){
        if(root==null){
            return max-min;
        }
        max=Math.max(root.val,max);
        min=Math.min(root.val,min);
        int maxLeft=maxDiff(root.left,min,max);
        int maxRight=maxDiff(root.right,min,max);
        return Math.max(maxLeft,maxRight);
    }
}