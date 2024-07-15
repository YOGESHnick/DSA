class Solution
{
    String modify(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = s.length() - 1;
        
        while (l < r) {
            if (isVowel(sb.charAt(l)) && isVowel(sb.charAt(r))) {
                swap(sb, l, r);
                l++;
                r--;
            } else if (!isVowel(sb.charAt(l))) {
                l++;
            } else if (!isVowel(sb.charAt(r))) {
                r--;
            }
        }

        return sb.toString();
    }
     boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    void swap(StringBuilder sb, int l, int r) {
        char temp = sb.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, temp);
    }
}
