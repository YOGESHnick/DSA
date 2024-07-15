class Solution {
    int height(Node node) 
    {
        if(node==null) return 0;
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        return 1+ Math.max(leftHeight,rightHeight);
    }
}
