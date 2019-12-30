class Solution {
    public int trap(int[] height) {
        
        int len = height.length;
        
        if(len <= 2){
            return 0;
        }
        
        int left[] = new int[len];
        int right[] = new int[len];
        
        int max = height[0];
        left[0] = height[0];
        
        for(int i=1; i<len-1; i++){
            if(height[i] < max){
                left[i] = max;
            }else{
                left[i] = height[i];
                max = height[i];
            }
        }
        
        
        max = height[len-1];
        right[len-1] = height[len-1];
        
        for(int i=len-2; i>=0; i--){
            if(height[i] < max){
                right[i] = max;
            }else{
                right[i] = height[i];
                max = height[i];
            }
        }
        
        int trappedWater = 0;
        
        for(int i=0; i<len-1; i++){
            trappedWater += Math.min(left[i],right[i]) - height[i];
        }
        
        return trappedWater;
    }
}
