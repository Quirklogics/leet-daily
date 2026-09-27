1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        Map<Node,Node>map = new HashMap <>();
19        Node curr = head;
20        while(curr != null){
21        map.put(curr,new Node(curr.val));
22        curr = curr.next;
23        }
24        curr = head;
25        while(curr != null){
26            Node copy = map.get(curr);
27            copy.next = map.get(curr.next);
28            copy.random = map.get(curr.random);
29            curr = curr.next;
30        }
31        return map.get(head);
32    }
33}