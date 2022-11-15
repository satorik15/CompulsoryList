package Variant_10;

public class List
{
    private Node head=null;

    public List(){}
    private boolean isEmpty()
    {
        return head==null;
    }
    public void add(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head=temp;
    }
    public void remove()
    {
        head=head.next;
    }
    public void removeAt(int key)
    {
        Node cur = head;
        Node prev=head;
        while(cur.data != key)
        {
            try
            {
                prev=cur;
                cur=cur.next;

            }
            catch(NullPointerException e)
            {
                System.out.println("List is empty");
            }
            if(cur==head)
            {
                head=head.next;
            }
            else
                prev.next=cur.next;

        }
    }
    public void sorting()
    {
        Node temp = head;
        Node max = head;
        int maximum=0;
        while(temp!=null)
        {
            if(temp.data>maximum)
            {
                max=temp;
                maximum=temp.data;
            }
            temp=temp.next;
        }
        if(max==head)
        {
            return;
        }
        else
        {
            removeAt(max.data);
            add(max.data);
        }


    }
    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
