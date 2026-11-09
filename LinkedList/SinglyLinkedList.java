public class SinglyLinkedList {
    static void main(String[] args) {
       Node n=new Node(10);
       System.out.println(n.data);
       System.out.println(n.next);

       System.out.println(n.data);
       Node n2=new Node(15);
       System.out.println(n2.data);

       n.next=n2;
    }
}
class Node{

    int data;
    Node next;
    public Node(int data){
        data=data;
    }

}
