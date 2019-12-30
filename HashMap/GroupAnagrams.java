class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            if(!map.containsKey(new String(temp))){
                ArrayList<String> arr = new ArrayList<>(); 
                arr.add(s);
                map.put(new String(temp),arr);
            }else{
                ArrayList<String> arr = map.get(new String(temp));
                arr.add(s);
                map.put(new String(temp),arr);
            }
        }
                
        List<List<String>> anagrams = new ArrayList<>();
        
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            anagrams.add(entry.getValue());
        }
        
        return anagrams;
    }
}
