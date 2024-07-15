class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        
        ArrayList<Long> result = new ArrayList<>(arr.length);
        while (left <= right) {
            if(result.size() % 2 ==0){
                result.add(arr[right--]);
            }else{
                result.add(arr[left++]);
            }
        }

        return result;
    }
}
