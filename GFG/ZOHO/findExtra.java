class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        int i;
        for(i=0;i<arr2.length;i++){
            if(arr1[i]!=arr2[i])return i;
        }
        if(i==arr2.length && arr1[i]!=arr2[i])return i+1;
        return i;
    }
}
