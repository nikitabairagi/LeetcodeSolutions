class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);        
        List<List<Integer>> threeSumList = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
            int j=i+1;
            int k= nums.length-1;
            
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            
            while(j < k){
                if(k < nums.length-1 && nums[k] == nums[k+1]){
                    k--;
                    continue;
                }
                
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    threeSumList.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                }else if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }
          }
        }
        
        return threeSumList;
    }
}
