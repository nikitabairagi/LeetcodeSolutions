class Solution {
    public int singleNumber(int[] nums) {
        
        int singleNumber = 0;
        for(int n : nums){
            singleNumber ^= n;
        }
        
        return singleNumber;
        
    }
}
