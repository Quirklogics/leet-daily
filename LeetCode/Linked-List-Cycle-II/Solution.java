1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast != null && fast.next != null){
17            slow = slow.next;
18            fast = fast.next.next;
19            if(fast == slow){
20                break; }}
21                if(fast ==  null || fast.next == null){
22                    return null;
23                }
24       ListNode curr = head;
25       while(curr != slow){
26        slow = slow.next;
27        curr = curr.next;
28       }
29      return curr;
30    }
31}