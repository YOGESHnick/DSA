class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        for(int i=0; current!=null && i< left-1;i++){
            prev = current;
            current = current.next;
        }  //by now we would have come to start index, "left"

        ListNode last=prev;
        ListNode newEnd=current;

        //reverse from left to right
        ListNode next=current.next;
        for(int i=0; current!=null && i< right-left+1 ; i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;
    }
}
