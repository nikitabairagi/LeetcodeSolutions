/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
    
    public boolean isValid(TreeNode root, Integer lower, Integer upper){
        if(root == null){
            return true;
        }
        int val = root.val;
        
        if(lower != null && val <= lower){
            return false;
        }
        
        if(upper != null && val >=upper){
            return false;
        }
        
        if(isValid(root.left,lower,val) &&  isValid(root.right,val,upper)){
            return true;
        }
        
        return false;
    }
}
