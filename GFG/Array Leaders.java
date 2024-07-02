class Solution {
 // Function to do reverse of a list. 
    static void rev(ArrayList<Integer> list, int start, int end){
        while( start <= end ){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
// Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
       
        ArrayList<Integer> list = new ArrayList<>();
        int maxi = arr[n - 1]; 
        for( int i = n - 1; i>=0; i-- ){
            if( arr[i] >= maxi ){
                list.add(arr[i]);
                maxi = arr[i];
            }
            maxi = Math.max(maxi,arr[i]); // Finding maximum element in right 
        }
        rev(list,0,list.size()-1);
        return list;
    
