class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }else{
                int count = map.get(n);
                count++;
                map.put(n,count);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        
        return 0;
    }
}
