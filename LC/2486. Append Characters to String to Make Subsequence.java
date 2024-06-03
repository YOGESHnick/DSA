class Solution {
    public int appendCharacters(String s, String t) {
        int sp=0;
        int tp=0;
        while( sp<s.length() && tp<t.length() ){
            if(s.charAt(sp)==t.charAt(tp)){
                tp++;
            }
            sp++;
        }
        return t.length()-tp;
    }
}
