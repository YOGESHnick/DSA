class Solution {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            // 0+1=1(ODD)
            // 1+0=1(ODD)
            // Here we Need two MOVES(add 1 and divide by 2)
            if ((s.charAt(i) - '0') + carry == 1) {
                carry = 1;
                count += 2;
            }
            // 0+0=0(EVEN)
            // 1+1=0(EVEN)
            // Here we Need one MOVE(Just divide by 2)
            else {
                count++;
            }
        }
        return carry + count;
    }
}
