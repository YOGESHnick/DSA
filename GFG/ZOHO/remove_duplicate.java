class Solution {
    public int remove_duplicate(List<Integer> arr) {
        int i=0;
        for (int j = 1; j < arr.size(); j++) {
            if (!arr.get(j).equals(arr.get(i))) {
                i++;
                arr.set(i, arr.get(j));
            }
        }
        return i + 1;
    }
}
