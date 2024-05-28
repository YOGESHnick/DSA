class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start=0;
        int currentCost=0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            currentCost += Math.abs(t.charAt(i) - s.charAt(i));
            while( currentCost > maxCost ){
                currentCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
