class Solution{
    static String removeChars(String string1, String string2){
        Set<Character> charsToRemove = new HashSet<>();
        for (char c : string2.toCharArray()) {
            charsToRemove.add(c);
        }
        
        StringBuilder result = new StringBuilder();
        
        for(char c:string1.toCharArray()){
            if(!charsToRemove.contains(c)) result.append(c);
        }
        return result.toString();
    }
}
