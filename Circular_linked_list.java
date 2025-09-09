class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next=null;
    }
}
//this class is for to insert and display the values in the format of linkedlist
class ll{
    node head=null;
    node pre=null;
    void ins(int val){
        node nn=new node(val);
        if(head==null){
            head=nn;
            nn.next=head;
            pre=nn;
        }
        else{
            pre.next=nn;
            nn.next=head;
            pre=nn;
        }
    }
    void dis(){
        node t=head;
        do{
            System.out.print(t.data+" ");
            t=t.next;
        }while(t!=head);
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
