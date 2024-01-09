import java.util.ArrayList;
public class Solution {
    public static int singleNonDuplicate(ArrayList < Integer > arr) {
        int n = arr.size();
        int answer = 0;
        if (n == 1) {
            return arr.get(0);
        }
        for (int i = 0; i < n - 1; i += 2) {
            int first = arr.get(i);
            int second = arr.get(i + 1);

            if (first != second) {
                answer = arr.get(i);
                break;
            }
        }
        int last = arr.get(n - 1);
        int secondLast = arr.get(n - 2);
        if (last != secondLast) {
            answer = arr.get(n - 1);
        }
        return answer;
    }
}
