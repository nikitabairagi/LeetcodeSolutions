/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int len =listLength(head);
        
        if(len == 0 || k % len == 0 || head == null || head.next == null){
            return head;
        }
        
        int m = len - (k%len);
        
        ListNode temp = head;
        ListNode r = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        while( m >1){
            r = r.next;
            m--;
        }
        
        ListNode newHead = r.next;
        r.next = null;
        temp.next = head;
        
        return newHead;
    }
    
    public int listLength(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}
