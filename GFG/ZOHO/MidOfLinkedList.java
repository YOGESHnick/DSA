class Solution {
    int getMiddle(Node head) {
        if (head == null) {
            return -1;
        }

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }
}
