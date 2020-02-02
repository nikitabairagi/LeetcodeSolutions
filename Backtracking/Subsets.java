class Solution {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        listSubsets(nums,0,nums.length,new ArrayList<Integer>());
        return result;
    }
    
    public void listSubsets(int[] nums, int start, int end, List<Integer> set){
         
        result.add(new ArrayList(set));
        
        for(int i=start;i < end;i++){
            set.add(nums[i]);
            listSubsets(nums,i+1,end,set);  
            set.remove(set.size()-1);
        }
    }
}
