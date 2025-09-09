// "static void main" must be defined in a public class.
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
class ll{
    Node head=null;
    Node old=null;
    void ins(int val){
        Node nn=new Node(val);
        if(head==null){
            head=nn;
            old=nn;
        }
        else{
            old.right=nn;
            nn.left=old;
            old=nn;
        }
    }
    void dis(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.right;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll nn=new ll();
        while(sc.hasNext()){
            int d=sc.nextInt();
            nn.ins(d);
        }
        nn.dis();
    }
}
