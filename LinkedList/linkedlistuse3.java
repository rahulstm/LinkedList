package Coding_ninjas.linkedlist.LinkedList;

public class linkedlistuse3 {
    public static void print(Node<Integer> head){
       // Node<Integer>temp=head;
        while (head != null) {
            System.out.print(head.data+" ");
            head=head.next;
            
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Node<Integer>node1=new Node<Integer>(40);
        Node<Integer>node2=new Node<Integer>(50);
        Node<Integer>node3=new Node<Integer>(60);
        node1.next=node2;
        node2.next=node3;
        Node<Integer>head=node1;
        print(head);
        print(head);
        
    }
    
}

