class Solution {
    static int evenlyDivides(int N) {
        int num = N;
        int count = 0;
        while (N > 0) {
            int rem = N % 10;
            N = (int) (N / 10);
            if (rem != 0) {
                if (num % rem == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
