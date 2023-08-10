public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        double ans = 0.0;
        switch (ch) {
            case 1:
                ans = Math.PI * a[0] * a[0];
                break;
            case 2:
                ans = a[0] * a[1];
                break;
        }
        return ans;
    }
}
