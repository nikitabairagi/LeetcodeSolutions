/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        
        Queue<Node> queue = new LinkedList<>();
        HashMap<Node,Node> visited = new HashMap<>();
        
        queue.add(node); 
        visited.put(node,new Node(node.val,new ArrayList<>()));
                
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            
            for(Node neighbor : temp.neighbors){
                if(!visited.containsKey(neighbor)){
                    visited.put(neighbor,new Node(neighbor.val,new ArrayList<>()));
                    queue.add(neighbor);
                }
                
                visited.get(temp).neighbors.add(visited.get(neighbor));
            }
        }
        
        return visited.get(node);        
    }
}
