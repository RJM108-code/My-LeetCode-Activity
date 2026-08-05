/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head == null || head.next == null || n<0)
        return null;
        ListNode refPtr = head;
        ListNode mainPtr = head;
        ListNode temp = null;

        int count = 0;
        while(count<n)
        {
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr!=null)
        {
            refPtr = refPtr.next;
            temp = mainPtr;
            mainPtr = mainPtr.next;
        }

        if(mainPtr.next == null)
        {
            temp.next = null;
            return head;
        }
        if(mainPtr == head)
        {
            return mainPtr.next;
        }
        temp.next = mainPtr.next;
        return head;

    }
}