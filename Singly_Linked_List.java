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
            pre=nn;
        }
        else{
            pre.next=nn;
            pre=nn;
        }
    }
    void dis(){
        node t=head;
        while(t!=null){
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
		//hashNext is for to move the cursor to the next element and check there is next element is existing or not and then it returns either true or false
		while(sc.hasNext()){
		    int d=sc.nextInt();
		    new_node.ins(d);
		}
		new_node.dis();
	}
}
