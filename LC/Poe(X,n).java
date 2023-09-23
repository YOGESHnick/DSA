class Solution {
    public double myPow(double x, int n) {
       if(n>=0){
           return calPower(x,n);
       }
        else{
            return 1/calPower(x,n);
        }
    }
    private double calPower(double x, int n){
        if(n==0) return 1;
        
        double res=calPower(x,n/2);
        if(n%2!=0){
            return res*res*x;
        }
      return res*res;  
    }
}
