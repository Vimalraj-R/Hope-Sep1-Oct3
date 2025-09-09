import java.util.*;
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
    node pre=null;
    void ins(int val){
        node nn=new node(val);
        if(head==null){
            head=nn;
            pre=nn;
        }
        else{
            pre.next=nn;
            pre=nn;
        }
    }
    void dis(){
        node t=head;
        if(t==pre){
            System.out.print("List is empty");
            return;
        }
        while(t!=null && t!=pre){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll new_node=new ll();
        while(sc.hasNext()){    
            int d=sc.nextInt();
            new_node.ins(d);
        }
        new_node.dis();
    }
}
