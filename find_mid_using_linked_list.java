// "static void main" must be defined in a public class.
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next=null;
    }
}
class ll{
    node head=null;
    node old=null;
    void ins(int val){
        node nn=new node(val);
        if(head==null){
            head=nn;
            old=nn;
        }else{
            old.next=nn;
            old=nn;
        }
    }
    void disp(){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll new_node=new ll();
        while(sc.hasNext()){
            int d=sc.nextInt();
            new_node.ins(d);
        }
        new_node.disp();
    }
}
