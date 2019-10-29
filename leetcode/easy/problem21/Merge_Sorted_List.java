/*
Algorithm:
1. Create one dummy node and point to that dummy node
2. till both the lists are non-empty keep moving forward based on minimum head
3. if one is null point to other
4. return dummy.next
*/




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp=head;
        while(l1!=null && l2!=null) {
            if(l1.val<l2.val) {
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }else{
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
        }
        temp.next=l1==null?l2:l1;
        return head.next;
    }
}
