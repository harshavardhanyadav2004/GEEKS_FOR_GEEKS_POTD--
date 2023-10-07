class Solution
{  
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next ;
        }
        return prev;
    }
    public static void rearrange(Node odd)
    {
        // add your code here
        Node head = null;
        Node curr = odd;
        Node prev   = null;
        Node bro = null;
        while(curr!=null)
        {   
            prev = curr;
            curr=curr.next;
           if(curr!=null){
            Node newnode = new Node(curr.data);
            if(head==null)
            {
                head=newnode;
                bro = head;
                
            }
            else {
                bro.next = newnode;
                bro = bro.next;
                
            }
            prev.next = curr.next;
            curr=curr.next;
           }
        }
        head = reverse(head);
        prev.next = head;
        
        
    }
}
