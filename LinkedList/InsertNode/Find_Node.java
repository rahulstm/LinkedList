package linkedlist.LinkedList.InsertNode;

public class Find_Node {
    public static int findNode(Node<Integer> head,int n){
        Node<Integer> curr=head;
        int count=0;
        while (curr!=null) {
            if(curr.data==n){
                return count;
            }
            curr=curr.next;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(3);
        head.next.next = new Node<>(5);
        head.next.next.next = new Node<>(7);
        head.next.next.next.next = new Node<>(8);
        head.next.next.next.next.next = new Node<>(9);

        int n=5;
       System.out.println(findNode(head,n));
    }
}
