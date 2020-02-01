class Solution {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        choose(n,k,1,new LinkedList<Integer>());
        return result;
    }
    
    public void choose(int n, int k,int start, LinkedList<Integer> set){
        
        if(set.size() == k){
            System.out.println(set);
            result.add(new LinkedList(set));
        }
        
        for(int i=start; i<= n;i++){
            set.add(i);
            choose(n,k,i+1,set);
            set.removeLast();
        }
    }
}
