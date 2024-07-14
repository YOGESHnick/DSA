class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = x-arr[i];
            if(map.containsKey(complement))
                return true;
            map.put(arr[i],i);
        }
        return false;
    }
}
