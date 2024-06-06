class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k<=0)return head;
        ListNode last=head;
        int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        // consider example 1
        last.next=head;
        int numOfRotations = k%length;
        int skip=length-numOfRotations;
        // place newlast at node with value '3'-> 5(index) - 2(numOfRotations)
        ListNode newLast=head;
        for(int i=0;i<skip-1;i++){
            newLast=newLast.next;
        }
        // after going to the node, place head in its next node, 4
        head=newLast.next;
        // make '3' as last node by pointing its next to null
        newLast.next=null;
        return head;
    }
}
