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
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levelOrderList = new ArrayList<>();
        queue.add(root);
        levelOrderList.add(new ArrayList<>(Arrays.asList(root.val)));

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> tempList = new ArrayList<>();

            while(level > 0){
                TreeNode temp = queue.poll();

                if(temp.left != null){
                    tempList.add(temp.left.val);
                    queue.add(temp.left);
                }

                if(temp.right != null){
                    tempList.add(temp.right.val);
                    queue.add(temp.right);
                }

                level--;
            }

            if(tempList.size() != 0)
                levelOrderList.add(tempList);
        }

        return levelOrderList;
    }
}