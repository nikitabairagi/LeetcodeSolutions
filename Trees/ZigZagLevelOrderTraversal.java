/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        
        Stack<TreeNode> stack1 = new Stack<>(); 
        Stack<TreeNode> stack2 = new Stack<>(); 
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        stack1.add(A);

        Boolean rightLeft = true;
           
            while(!stack1.isEmpty() || !stack2.isEmpty()){    
                if(rightLeft){
                    ArrayList<Integer> templist = new ArrayList<>();
                    while(! stack1.isEmpty()){
                        TreeNode temp = stack1.pop();
                        templist.add(temp.val);
                        
                        if(temp.left != null){
                            stack2.push(temp.left);
                        }
                        
                        if(temp.right != null){
                            stack2.push(temp.right);
                        }
                    }
                    rightLeft = false;
                    list.add(templist);
                    
                }else{
                    ArrayList<Integer> templist = new ArrayList<>();
                    while(!stack2.isEmpty()){
                        TreeNode temp = stack2.pop();
                        templist.add(temp.val);
                        if(temp.right != null){
                            stack1.push(temp.right);
                        }
                        
                        if(temp.left != null){
                            stack1.push(temp.left);
                        }

                    }
                    rightLeft = true;
                    list.add(templist);
                }
            }
        
        return list;
    }
}
