class Solution {
    void pushZerosToEnd(int[] arr) {
        int lastNonZeroIndex = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = temp;

                lastNonZeroIndex++;
            }
        }
    }
}
