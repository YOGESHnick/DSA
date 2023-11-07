public class Solution {
    public static int countDigits(int n){
        int c=0;
        int nn=n;
        while(nn>0){
            int x=nn%10;
            if(x>0 && n%x==0){c++;}
            nn=nn/10;
        }
        return c;
    }
}
