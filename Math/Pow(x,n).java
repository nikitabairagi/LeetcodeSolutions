class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0 ){
            x = 1/x;
            N = -N;
        }
        
        return calPow(x,N);
    }
    
    public double calPow(double x, long n){
        if(n == 0){
            return 1.0;
        }
        double pow = calPow(x,n/2);
    
        if(n % 2 == 0)
            return pow * pow;
        else
            return x * pow * pow;
        
    }
}
