public class Solution {
    public static String read(int n, int []nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j]+nums[i] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
