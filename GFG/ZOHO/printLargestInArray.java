class Solution {
    String printLargest(int n, String[] arr) {
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder largestNumber = new StringBuilder();
        for (String num : arr) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}
