class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> set = new HashSet<>();
        
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = nextNumber(n);
        }
        
        return n==1;
    }
    
    public int nextNumber(int n){
        int sum = 0;
        
        while(n > 0){
            int d = n%10;
            n = n/10;
            sum += d*d;
        }
        
        return sum;
    }
}
