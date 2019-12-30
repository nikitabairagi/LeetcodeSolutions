class inorder_tree_iterator {

    Stack<BinaryTreeNode> stack = new Stack<>();
    public inorder_tree_iterator(BinaryTreeNode root) {
      stack.push(root);
      BinaryTreeNode temp = stack.peek();
      while(temp.left != null){
          stack.push(temp.left);
          temp = temp.left;
      }
    }

    public boolean hasNext() {
      if(!stack.isEmpty()){
        return true;
      }
      return false;
    }

    public BinaryTreeNode getNext() {
      if(stack.isEmpty()){
        return null;
      }
      BinaryTreeNode temp =  stack.pop();
      BinaryTreeNode rTemp = temp.right;

      while(rTemp != null){
        stack.push(rTemp);
        rTemp = rTemp.left;
      }

      return temp;
    }
  
    //Don't Change anything down below
    public String inorder_using_iterator(BinaryTreeNode root) {
      inorder_tree_iterator iter = new inorder_tree_iterator(root);
      String result = "";
      while (iter.hasNext()) {
        result += iter.getNext().data + ",";
      }
      return result;
    }   
}
