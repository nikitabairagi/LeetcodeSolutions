class inorderIterative{
  static String inorder_iterative(BinaryTreeNode root)
  {
    Stack<BinaryTreeNode> stack = new Stack<>();
    StringBuilder s = new StringBuilder();
    stack.push(root);
    BinaryTreeNode temp = stack.peek();

    while(!stack.isEmpty()){
      while(temp.left != null){
        stack.push(temp.left);
        temp = temp.left;
      }
      BinaryTreeNode node = stack.pop();
      s.append(node.data + ",");
      if(node.right != null){
        stack.push(node.right);
        temp = node.right;
      }
      
    }
    return s.toString();
  }   
}  
