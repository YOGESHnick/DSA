class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        return set.size();
    }
}