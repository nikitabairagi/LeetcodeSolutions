class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 0){
            return -1;
        }
        
        int pivot = findPivot(nums,0, (nums.length-1));
        // System.out.println(pivot);
        if(nums[pivot] == target){
            return pivot;
        }else if(target > nums[pivot] && target <= nums[nums.length-1]){
            return binarySearch(nums, pivot+1, nums.length-1,target);
        }else{
            return binarySearch(nums,0,pivot-1,target);
        }
        
    }
    
    public int binarySearch(int[] nums, int low, int high,int target){
        
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                high = mid-1;   
            }else{
                low = mid+1;
            }
        }
        
        return -1;
    }
    
    public int findPivot(int[] nums, int low, int high){
        
        if(nums[low] < nums[high]){
            return 0;
        }
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(low == high){
                return low;
            }
            
            if(nums[mid] < nums[mid+1] && nums[mid] < nums[mid-1]){
                return mid;
            }else if(nums[mid] < nums[nums.length-1]){
                high = mid-1;   
            }else if(nums[mid] > nums[nums.length-1]){
                low = mid+1;
            }
        }
        
        return 0;
        
    }
}
