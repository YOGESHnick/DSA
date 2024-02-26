class Solution {
    public static void preOrderTraverse(TreeNode node, ArrayList arr) {
        if (node == null) {
            arr.add(null);
            return;
        }
        arr.add(node.val);
        preOrderTraverse(node.left, arr);
        preOrderTraverse(node.right, arr);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        preOrderTraverse(p, a);
        preOrderTraverse(q, b);
        return a.equals(b);
    }
}
