class Compute {
    
    public void rotate(int arr[], int n)
    {
        for(int i=n-1;i>0;i--){
            int t= arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=t;
        }
    }
}
