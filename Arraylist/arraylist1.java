package Coding_ninjas.linkedlist;
import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
     ArrayList<Integer> list1=new ArrayList<>();
    System.out.println(list1.size());
    list1.add(5);
    System.out.println(list1.size());
    list1.add(7);
    list1.add(9);
    System.out.println(list1.size());
    list1.add(2, 50);
    System.out.println(list1.get(2));
    for(int i=0;i<list1.size();i++){
       System.out.print(list1.get(i)+" ");
    }
    System.out.println();
    list1.remove(0);
    for(int i=0;i<list1.size();i++){
        System.out.print(list1.get(i)+" ");
    }
    }
    
}
