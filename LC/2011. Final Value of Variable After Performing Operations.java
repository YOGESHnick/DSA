class Solution {
    public int result = 0;
    public int finalValueAfterOperations(String[] operations) {
        for(int i = 0; i < operations.length; i++) {
            operation(operations[i]);
        }
        return result;
    }
    public void operation(String op) {
        switch(op) {
            case "--X":
                --result;
                break;
            case "++X":
                ++result;
                break;
            case "X--":
                result--;
                break;
            case "X++":
                result++;
                break;
        }
    }
}
