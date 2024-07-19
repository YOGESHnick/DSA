class LinkedList
{
    Node sortedMerge(Node head1, Node head2) {
        if(head1==null)return head2;
        if(head2==null)return head1;
        
        if(head1.data < head2.data){
            head1.next=sortedMerge(head1.next,head2);
            return head1;
        }else{
            head2.next=sortedMerge(head2.next,head1);
            return head2;
        }
   } 
}
