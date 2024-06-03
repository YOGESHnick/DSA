class Solution {
     public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = findmid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);
        ListNode result = merge(left, right);
        return result;
    }
     ListNode findmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

     ListNode merge(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }
        return dummy.next;
    }
}
