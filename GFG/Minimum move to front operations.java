class Solution {
    // Function to find the minimum number of moves required.
    public int minMoves(ArrayList<Integer> arr) {
        // code here.
        int thevapadumItem=arr.size();
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)==thevapadumItem){
                thevapadumItem--;
            }
        }
        return thevapadumItem;
    }
}
