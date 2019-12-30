/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        while(temp1 != null || temp2 != null){
            int x = (temp1 != null)? temp1.val : 0;
            int y = (temp2 != null)? temp2.val : 0;
            
            sum = x + y + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            
            if(temp1 != null)
                temp1 = temp1.next;
            if(temp2 != null)
                temp2 = temp2.next;
        }
        
        if(carry != 0){
            temp.next = new ListNode(carry);
        }
        
        return head.next;
    }
}
