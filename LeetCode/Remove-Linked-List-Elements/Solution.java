1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode curr = dummy, nxt = head;
16        while(nxt != null){
17            if(nxt.val == val){
18                curr.next = nxt.next;
19            }
20            else{
21                curr = nxt;
22            }
23            nxt = nxt.next;
24        }
25        return dummy.next;
26    }
27}