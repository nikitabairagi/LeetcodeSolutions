class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int threeSumClosest = 0;
        
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                int currDiff = Math.abs(target-sum);
               
                if(currDiff == 0){
                    return sum;
                }
                
                if(currDiff < minDiff){
                    minDiff = currDiff;
                    threeSumClosest = sum;
                }
                
                if(sum <= target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        
        return threeSumClosest;
    }
}
