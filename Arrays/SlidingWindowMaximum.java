class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0 ;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        
        while(end < nums.length){
            int currMax = nums[end];
            
            if(currMax > max){
                max = currMax;
            }
            
            if((end-start) == k-1){
                start += 1;
                end = start-1;
                list.add(max);
                max = Integer.MIN_VALUE;
            }
            end++;
        }
        
        int[] arr = new int[list.size()];
        
        for(int i = 0 ;i<list.size();i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}
