class Solution {
    int getMiddle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
}
