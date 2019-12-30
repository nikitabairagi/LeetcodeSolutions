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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null){
            return root;
        }
        
        TreeNode temp = root;
        TreeNode successor = null;
        
        while(temp != null){
            if(p.val < temp.val){
                successor = temp;
                temp = temp.left;
                
            }else if(p.val > temp.val){
                temp = temp.right;
                
            }else{
                if(temp.right != null){
                    TreeNode node = temp.right;
                    while(node.left != null){
                        node = node.left;    
                    }
                    return node;
                }else{
                   
                    return successor;   
                }
                
            }
        }
        
        return successor;
    }
    

}
