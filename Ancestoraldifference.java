/*Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.

A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b. */







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