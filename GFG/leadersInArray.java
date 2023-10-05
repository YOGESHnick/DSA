class Solution{
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> x = new ArrayList<>();
        int max=arr[n-1];
        int i;
        for(i=n-1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                  max=arr[i];
                x.add(max);
            }
        }
        Collections.reverse(x);
        return x;
    }
}
