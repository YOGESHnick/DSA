class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode b = head;
        while(f!=null){
            if(f!=null){f=f.next;}
            if(f!=null){
                f=f.next;
                b=b.next;
            }
        }
        return b;
    }
}
