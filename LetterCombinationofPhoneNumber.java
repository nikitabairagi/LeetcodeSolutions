class Solution {
     HashMap<Integer,String> map = new HashMap<Integer,String>(){{
        put(2,"abc");
        put(3,"def");
        put(4,"ghi");
        put(5,"jkl");
        put(6,"mno");
        put(7,"pqrs");
        put(8,"tuv");
        put(9,"wxyz");
     }};
        
    List<String> combinations = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return combinations;
        }
        
        backtrack("",digits);
        return combinations;
    }
    
    public void backtrack(String pairs , String nextDigit){
        if(nextDigit.length() == 0){
            combinations.add(pairs);
        }else{
            String digit = nextDigit.substring(0,1);
            String letters = map.get(Integer.parseInt(digit));
            
            for(int i=0 ; i<letters.length(); i++){
               backtrack(pairs + letters.charAt(i), nextDigit.substring(1));
            }
        }
    }
}
