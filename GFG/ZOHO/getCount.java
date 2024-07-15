class Sol
{
    int getCount (String S, int N)
    {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        char prevChar = '\0'; 
        
        for (char c : S.toCharArray()) {
            if (c != prevChar) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                prevChar = c; 
            }
        }
        
        int result = 0;
        for (int count : charCountMap.values()) {
            if (count == N) {
                result++;
            }
        }
        return result;
    }
}
