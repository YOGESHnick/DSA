public class Solution {
    public static String compareIfElse(int num1, int num2) {
        if (num1 > num2) {
            return "greater";
        } else if (num1 < num2) {
            return "smaller";
        }
        return "equal";
    }
}
