public class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength=0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                maxLength+=2;
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            maxLength+=1;
// one character from the set can be placed at center to increase length
        }
        return maxLength;
    }
}
