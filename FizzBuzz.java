class Solution {
    public List<String> fizzBuzz(int n) {
     
        List<String> list = new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(3,"Fizz");
        map.put(5,"Buzz");
        
        for(int num=1; num<=n ;num++){
            String temp = "";
            
            for(Integer key : map.keySet()){
                if(num % key == 0){
                    temp += map.get(key);
                }
            }
            
            if(temp.equals("")){
                temp += Integer.toString(num);
            }
            
            list.add(temp);
        }
        
        return list;
    }
}
