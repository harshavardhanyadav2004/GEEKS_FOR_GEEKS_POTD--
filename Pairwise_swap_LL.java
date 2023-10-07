class Solution {
    public Node pairwiseSwap(Node head)
    {
        Node newnode = new Node(-1);
        newnode.next = head;
        Node point = newnode;
        while(point.next!=null&&point.next.next!=null)
        {
            Node swap1 = point.next;
            Node swap2 = point.next.next;
            swap1.next = swap2.next;
            swap2.next = swap1;
            
            point.next = swap2;
            point=swap1;
        }
        return newnode.next;
    }
}
