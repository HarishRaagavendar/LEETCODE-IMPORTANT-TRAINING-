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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode dummy=head;
        int cnt=1;
        while(dummy.next!=null){
            dummy=dummy.next;
            cnt++;
        }
        dummy.next=head;
        k=k%cnt;
        k=cnt-k;
        while(k-- >0){
            dummy=dummy.next;
        }
        head=dummy.next;
        dummy.next=null;
        return head;
    }
}
