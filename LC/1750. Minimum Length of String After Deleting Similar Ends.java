class Solution {
    public int minimumLength(String s) {
        int f=0,b=s.length()-1;
        while(f<b  && s.charAt(f)==s.charAt(b)){
            char ch = s.charAt(f);
            while( f<=b && s.charAt(f) == ch ){ f++; }
            while( f<=b && s.charAt(b) == ch ){ b--; }
        }
        return b-f+1;
    }
}
