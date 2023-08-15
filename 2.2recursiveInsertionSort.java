public class Solution {
    public static void insertionSort(int []arr, int n) {
        insertionSortHelper(arr, 0, n);
    }
    public static void insertionSortHelper(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            swap(arr, j, j - 1);
            j--;
        }
        insertionSortHelper(arr, i + 1, n);
    }
    public static void swap(int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
