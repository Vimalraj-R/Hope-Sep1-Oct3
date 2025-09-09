// "static void main" must be defined in a public class.
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class ListNode
{
    Node ins(Node head, int val)
    {
        Node nn = new Node(val);
        if(head==null)
        {
            head = nn;
        }
        else
        {
            Node t = head;
            while(t.next!=null)
                t = t.next;
            t.next = nn;
        }
        return head;
    }
    void dis(Node head)
    {
        Node t = head;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        ListNode l = new ListNode();
        while(sc.hasNext())
        {
            int d = sc.nextInt();
            head=l.ins(head,d);
        }
        l.dis(head);
    }
}
