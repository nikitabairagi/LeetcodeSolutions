/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode temp1 = head;
        ListNode temp2 = head;
        
        while(temp1 != null){
            length++;
            temp1 = temp1.next;
        }
        
        temp1 = head;
        int n = length/2;
        
        while(n > 0){
            temp2 = temp2.next;
            n--;
        }
        
        temp2 = reverseList(temp2);
        
        while(temp2 != null){
        
            if(temp1.val != temp2.val){
                return false;
            }
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode temp = null;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            if(prev == head){
                prev.next = null;
            }
            prev = curr;
            curr = temp;
            
        }
        
        return prev;
    }
}
