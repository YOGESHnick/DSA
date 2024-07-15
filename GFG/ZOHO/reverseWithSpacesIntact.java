class Solution
{
    String reverseWithSpacesIntact(String S){
         char[] chars = S.toCharArray();
        int left = 0, right = chars.length - 1;
        char[] result = new char[chars.length];

        while (left <= right) {
            if (chars[left] == ' ') {
                result[left] = ' ';
                left++;
            } else if (chars[right] == ' ') {
                result[right] = ' ';
                right--;
            } else {
                result[left] = chars[right];
                result[right] = chars[left];
                left++;
                right--;
            }
        }
        
        return new String(result);
    }
}
