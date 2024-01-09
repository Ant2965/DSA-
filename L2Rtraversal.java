/*Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.



For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

  */










/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {


        if(root1==null || root2 == null){
            return false;
        }


        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>();
      

        leaf1(root1,l1);
        leaf2(root2 ,l2);

        if(l1.size()!=l2.size()){
            return false;
        }
        for(int i=0;i<l1.size();i++){



            if(l1.get(i)!=l2.get(i)){
                return false;
            }

        }
        return true;
    }


public static void leaf1(TreeNode root1 , ArrayList<Integer> l1){
    if(root1== null){
        return;
    }
    if(root1.left==null && root1.right== null){
        l1.add(root1.val);
    }
    leaf1(root1.left ,l1);
    leaf1(root1.right ,l1);
}



public static void leaf2(TreeNode root2 , ArrayList<Integer> l2){
    if(root2== null){
        return;
    }
    if(root2.left==null && root2.right== null){
        l2.add(root2.val);
    }
    leaf2(root2.left ,l2);
    leaf2(root2.right ,l2);
}

}