package linkedlist.LinkedList;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(600);
        list.addLast(500);
        list.addFirst(7);
        list.addLast(100);
        System.out.println(list.get(5));

        list.set(2, 150);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    
}
