class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 0) 
        {
            return head;
        }
        //finding length and getting the tail
        int l = 1;
        ListNode tail = head;
        while (tail.next != null) 
        {
            tail = tail.next;
            l++;
        }

        //optimising k for k>=l
        k = k % l;
        if (k == 0) 
        {
            return head;
        }

        //Connect tail to head to make it a circle
        tail.next = head;

        //Find the new tail: (l - k) steps from the head
        ListNode newTail = head;
        for (int i = 0; i < l - k - 1; i++) {
            newTail = newTail.next;
        }

        //Break the circle and set the new head
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}