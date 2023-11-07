public class Solution {
    public static int calcGCD(int a, int b){
        int gcd=1;
        while(a>0 && b>0){
            if(a>b){a=a%b;}
            else{b=b%a;}
        }
        if(a==0){return b;}
        else{return a;}
    }
}
