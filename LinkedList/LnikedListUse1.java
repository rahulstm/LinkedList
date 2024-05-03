package Coding_ninjas.linkedlist.LinkedList;

public class LnikedListUse1 {
    public static void main(String[] args) {
        Node<Integer>node1=new Node<Integer>(40);
        Node<Integer>node2=new Node<Integer>(50);
        Node<Integer>node3=new Node<Integer>(60);
        node1.next=node2;
        node2.next=node3;
        Node<Integer>head=node1;
        while (head != null) {
            System.out.print(head.data+" ");
            head=head.next;
            
        }
        System.out.println();
        while (head != null) {
            System.out.print(head.data+" ");
            head=head.next;
            
        }
    }
    
}
