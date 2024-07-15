class Solution {
    public boolean isValid(String ip) {
        if (ip == null || ip.isEmpty()) return false;
        if (ip.charAt(ip.length() - 1) == '.')  return false;
        
        String[] parts = ip.split("\\.");
        
        if (parts.length != 4) return false;
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false; 
                
                // 1 digit can be 0 -> 122.0.12.2 ->good, 122.01.12.2 ->bad
                if (part.length() != 1 && part.charAt(0) == '0') return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
