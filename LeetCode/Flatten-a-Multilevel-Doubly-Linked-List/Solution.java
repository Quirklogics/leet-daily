1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        if(head == null){
14            return null;
15        }
16        Node pHead = new Node();
17        Node prev = pHead;
18        Stack<Node> stack = new Stack <>();
19        stack.push(head);
20        while(!stack.isEmpty()){
21         Node curr = stack.pop();
22         curr.prev = prev;
23         prev.next = curr;
24         if(curr.next != null){
25            stack.push(curr.next);
26         }
27         if(curr.child != null){
28            stack.push(curr.child);
29         }
30         prev = curr;
31         curr.child = null;
32        }
33        pHead.next.prev = null;
34        return pHead.next;
35    }
36}