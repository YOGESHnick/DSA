class Solution {
    public int romanToDecimal(String str) {
        int value = 0;
        int prevValue = 0;
        
        for (int i = str.length() - 1; i >= 0; i--) {
            int currentValue = getRomanValue(str.charAt(i));
            if (currentValue < prevValue) {
                value -= currentValue;
            } else {
                value += currentValue;
            }
            prevValue = currentValue;
        }
        
        return value;
    }
    
    private int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
